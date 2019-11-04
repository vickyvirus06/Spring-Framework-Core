package com.vicky.AnnotationSetter.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vicky.AnnotationSetter.POJO.Name;
import com.vicky.AnnotationSetter.POJO.Registration;

@Configuration
public class AppConfig {

	
	@Bean
	public Registration registrationBean()
	{
		return new Registration();
	}
	
	@Bean
	public Name nameBean()
	{
		return new Name();
	}
}
