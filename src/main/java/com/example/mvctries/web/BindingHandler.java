package com.example.mvctries.web;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class BindingHandler {
	@Before("controller() && allMethod()")
	public void logBefore(JoinPoint joinPoint) {
		log.debug("--- 0");
	}
}
