package com.demo.bean;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String eName;
	private double Sal;
	private LocalDate jdt;
	public Employee() {
		super();
	}
	public Employee(int empId, String eName, double sal, LocalDate jdt) {
		super();
		this.empId = empId;
		this.eName = eName;
		Sal = sal;
		this.jdt = jdt;
		
	}
	
	
	public boolean equals(Object obj) {
		System.out.println("in equals method "+this.empId+"----"+((Employee)obj).empId);
		return this.empId== ((Employee)obj).empId;
		
	}
	
	
	
	public Employee(int eid) {
		this.empId = eid;
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getSal() {
		return Sal;
	}
	public void setSal(double sal) {
		Sal = sal;
	}
	public LocalDate getJdt() {
		return jdt;
	}
	public void setJdt(LocalDate jdt) {
		this.jdt = jdt;
	}
	@Override
	public String toString() {
		
		return "Employee [empId=" + empId + ", eName=" + eName + ", Sal=" + Sal + ", jdt=" + jdt + "]";
	}
	@Override
	public int compareTo(Employee o) {
		System.out.println("in compareTo method "+this.empId+"----"+o.empId);
		System.out.println("");
		return (int)(this.Sal-o.Sal);
	}
	
	
	

}
