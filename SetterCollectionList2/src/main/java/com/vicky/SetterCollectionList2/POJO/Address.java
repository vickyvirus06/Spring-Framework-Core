package com.vicky.SetterCollectionList2.POJO;

public class Address {
	
	private String street;
	private int pincode;
	private String city;
	
	
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "[street=" + street + ", pincode=" + pincode + ", city=" + city + "]";
	}
	
	
	
	
	
	

}
