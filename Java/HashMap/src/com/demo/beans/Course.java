package com.demo.beans;

public class Course {
	private String cName;
	private int Capacity;
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	public Course(String cName, int capacity) {
		super();
		this.cName = cName;
		Capacity = capacity;
	}
	public Course() {
		super();
	}
	@Override
	public String toString() {
		return "Course [cName=" + cName + ", Capacity=" + Capacity + "]";
	}
	

}
