package com.vicky.SetterDependentObject.POJO;

public class Mobile {
	
	private OS os;
	private Brand brand;
	private Ram ram;
	private int price;
	
	
	public OS getOs() {
		return os;
	}


	public void setOs(OS os) {
		this.os = os;
	}


	public Brand getBrand() {
		return brand;
	}


	public void setBrand(Brand brand) {
		this.brand = brand;
	}


	public Ram getRam() {
		return ram;
	}


	public void setRam(Ram ram) {
		this.ram = ram;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Mobile [os=" + os + "\n brand=" + brand + "\n ram=" + ram + "\n price=" + price + "]";
	}
	
	
	
	
	
	

}
