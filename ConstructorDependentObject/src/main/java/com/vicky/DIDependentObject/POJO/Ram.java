package com.vicky.DIDependentObject.POJO;

public class Ram {
	
	private String name;
	private String size;
	public Ram(String name, String size) {
		
		this.name = name;
		this.size = size;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", size=" + size + "]";
	}
	
	

}
