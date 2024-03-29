package com.vicky.AnnotationQualifier.Impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.vicky.AnnotationQualifier.Interface.Mobile;

@Component
public class Samsung implements Mobile{

	@Value("Note 8")
	private String model;
	
	@Value("4GB")
	private String ram;
	
	@Value("54000")
	private int price;
	
	public void details() {
		System.out.println("Name : Samsung" +"\n"+"Model  : " + model+"\n"+"Ram  : "+ram +"\n" + "Price :  "+ price);
		
	}

	
}
