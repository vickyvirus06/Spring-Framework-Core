package com.vicky.AnnotationQualifier.POJO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.vicky.AnnotationQualifier.Interface.Mobile;

@Component
public class Shop {

	@Value("Vicky Shop")
	private String name;
	
	@Autowired
	@Qualifier("iphone")
	private Mobile mobile;
	@Autowired
	private Address address;

	public void shop()
	{
		System.out.println(name);
		mobile.details();
		address.adddetails();
	}

}

