package com.example.mvctries;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(useDefaultFilters = false,
		includeFilters = @ComponentScan.Filter(Aspect.class))
public class MyConfiguration {
}
