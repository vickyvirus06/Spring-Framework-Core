package com.vicky.DIConstructor.POJO;

public class Student {
	
	private int sid;
	private String name;
	private String course;
	public Student(int sid, String name, String course) {
		
		this.sid = sid;
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", course=" + course + "]";
	}
	
	
	
	

}
