package com.AnnotationSetter.POJO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("marenhalli road")
	private String street;
	
	@Value("560060")
	private int pincode;
	

	
	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public int getPincode() {
		return pincode;
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}



	@Override
	public String toString() {
		return "[street=" + street + ", pincode=" + pincode + "]";
	}
	
	

}
