package com.example.mvctries.web.aop;

import com.example.mvctries.json.deserializer.DeserializersState;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.Arrays;

/**
 * The logic for copying the gathered binding errors
 * into the @Controller method BindingResult argument.
 */
@Aspect
@Component
public class BindingErrorsHandler {
	@Before("@within(org.springframework.web.bind.annotation.RestController)")
	public void logBefore(JoinPoint joinPoint) {
		// use gathered errors
		Arrays.stream(joinPoint.getArgs())
				.filter(o -> o instanceof BindingResult)
				.map(o -> (BindingResult) o)
				.forEach(errors -> {
					DeserializersState.ERRORS.get().forEach((k, v) -> {
						errors.addError(new FieldError(errors.getObjectName(), k, v, true, null, null, null));
					});
				});
		// errors copied, clean the ThreadLocal
		DeserializersState.ERRORS.remove();
	}
}
