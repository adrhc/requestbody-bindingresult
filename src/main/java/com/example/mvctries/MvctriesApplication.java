package com.example.mvctries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableAspectJAutoProxy
@Import(MyConfiguration.class)
public class MvctriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvctriesApplication.class, args);
	}

}
