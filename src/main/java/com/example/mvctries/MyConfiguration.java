package com.example.mvctries;

import com.example.mvctries.web.aop.BindingHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {BindingHandler.class})
public class MyConfiguration {
}
