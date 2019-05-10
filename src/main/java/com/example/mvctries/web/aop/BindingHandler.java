package com.example.mvctries.web.aop;

import com.example.mvctries.json.deserializer.DeserializersState;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.Arrays;

@Slf4j
@Aspect
@Component
public class BindingHandler {
	@Before("@within(org.springframework.web.bind.annotation.RestController)")
	public void logBefore(JoinPoint joinPoint) {
		log.debug("joinPoint.getArgs:\n", joinPoint.getArgs());
		Arrays.stream(joinPoint.getArgs())
				.filter(o -> o instanceof BindingResult)
				.map(o -> (BindingResult) o)
				.forEach(errors -> {
					DeserializersState.ERRORS.get().forEach((k, v) -> {
						errors.addError(new FieldError("", k, v, true, null, null, null));
					});
				});
	}
}
