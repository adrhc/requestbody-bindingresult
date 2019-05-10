package com.example.mvctries;

import com.example.mvctries.web.aop.BindingErrorsHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {BindingErrorsHandler.class})
public class MyConfiguration {
}
