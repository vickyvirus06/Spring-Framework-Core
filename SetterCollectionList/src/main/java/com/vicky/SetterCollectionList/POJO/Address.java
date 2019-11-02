package com.vicky.SetterCollectionList.POJO;

public class Address {
	
	private String street;
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
