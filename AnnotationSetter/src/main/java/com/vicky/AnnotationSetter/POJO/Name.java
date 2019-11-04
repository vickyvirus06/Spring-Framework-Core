package com.vicky.AnnotationSetter.POJO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Name {
	
	@Value("vicky")
	private String first;
	
	@Value("Poojari")
	private String last;
	
	@Value("Ravi")
	private String middle;

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getMiddle() {
		return middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	@Override
	public String toString() {
		return "Name [first=" + first + ", last=" + last + ", middle=" + middle + "]";
	}
	
	

}
