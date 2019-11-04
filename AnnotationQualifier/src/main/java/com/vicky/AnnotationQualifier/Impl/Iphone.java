package com.vicky.AnnotationQualifier.Impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.vicky.AnnotationQualifier.Interface.Mobile;

@Component
public class Iphone implements Mobile{

	@Value("Iphone 6s")
	private String model;
	
	@Value("2GB")
	private String ram;
	
	@Value("24000")
	private int price;
	
	public void details() {
		System.out.println("Name : Iphone " +"\n" + "Model   : " +model+"\n"+"Ram  : "+ram +"\n" + "Price :  "+ price);
		
	}


}
