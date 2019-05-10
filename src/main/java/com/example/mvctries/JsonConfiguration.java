package com.example.mvctries;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.context.properties.bind.BindHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Configuration(proxyBeanMethods = false)
public class JsonConfiguration {
	@Primary
	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(
			ObjectMapper objectMapper) {
		return new MappingJackson2HttpMessageConverter(objectMapper);
	}
}
