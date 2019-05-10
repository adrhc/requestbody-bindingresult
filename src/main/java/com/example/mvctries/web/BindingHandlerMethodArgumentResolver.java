package com.example.mvctries.web;

import org.springframework.core.MethodParameter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

import java.util.List;

public class BindingHandlerMethodArgumentResolver extends RequestResponseBodyMethodProcessor {
	public BindingHandlerMethodArgumentResolver(List<HttpMessageConverter<?>> converters) {
		super(converters);
	}

	public BindingHandlerMethodArgumentResolver(List<HttpMessageConverter<?>> converters, ContentNegotiationManager manager) {
		super(converters, manager);
	}

	public BindingHandlerMethodArgumentResolver(List<HttpMessageConverter<?>> converters, List<Object> requestResponseBodyAdvice) {
		super(converters, requestResponseBodyAdvice);
	}

	public BindingHandlerMethodArgumentResolver(List<HttpMessageConverter<?>> converters, ContentNegotiationManager manager, List<Object> requestResponseBodyAdvice) {
		super(converters, manager, requestResponseBodyAdvice);
	}

	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		return false;
	}

	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		return super.resolveArgument(parameter, mavContainer, webRequest, binderFactory);
	}
}
