package com.vicky.AnnotationSetter.Config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.AnnotationSetter.POJO.Address;
import com.AnnotationSetter.POJO.SJT;

@Configuration
public class AppConfig {
	
	@Bean
	public Address addressBean()
	{
		return new Address();
	}
	
	@Bean
	public SJT sjtBean()
	{
		return new SJT();
	}
	
	@Bean
	public  List<String> courses()
	{
		return Arrays.asList("Java","JDBC","JSP","Spring");
	}
	

}
