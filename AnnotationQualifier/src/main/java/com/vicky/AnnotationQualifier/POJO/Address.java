package com.vicky.AnnotationQualifier.POJO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	
	@Value("Marenhalli Road")
	private String street;
	
	@Value("560060")
	private String pincode;
	
	public void adddetails()
	{
		System.out.println("Street :  " + street +"\n"+"Pincode  : " +pincode);
	}

}
