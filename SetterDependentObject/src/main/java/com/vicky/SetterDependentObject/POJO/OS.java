package com.vicky.SetterDependentObject.POJO;

public class OS {
	
	private double version;
	
	private String name;

	

	public double getVersion() {
		return version;
	}



	public void setVersion(double version) {
		this.version = version;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "[version=" + version + ", name=" + name + "]";
	}
	
	

}
