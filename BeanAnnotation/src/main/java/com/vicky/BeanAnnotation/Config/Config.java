package com.vicky.BeanAnnotation.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vicky.BeanAnnotation.POJO.Mobile;

@Configuration
@ComponentScan(basePackages="com.vicky.BeanAnnotation.POJO")
public class Config {
	
	@Bean
	public Mobile mobileBean()
	{
		Mobile mobile = new Mobile();
		return mobile;
	}

}
