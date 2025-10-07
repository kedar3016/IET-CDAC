package com.demo.bean;

import java.util.Date;

public class VendorEmployee extends Employee{
	private int noOfEmp;
	private double perEmpSal;
	public VendorEmployee() {
		super();
		System.out.println("In a VendorEmployee Default Constructor");
	}
	public VendorEmployee(String pName, Date bdate, String dept, String desg, int noOfEmp, double perEmpSal) {
		super("v",pName,bdate,dept,desg);
		this.noOfEmp = noOfEmp;
		this.perEmpSal = perEmpSal;
		System.out.println("In a VendorEmployee Para Constructor");
	}
	public int getNoOfEmp() {
		return noOfEmp;
	}
	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}
	public double getPerEmpSal() {
		return perEmpSal;
	}
	public void setPerEmpSal(double perEmpSal) {
		this.perEmpSal = perEmpSal;
	}
	@Override
	public String toString() {
		return super.toString()+"VendorEmployee [noOfEmp=" + noOfEmp + ", perEmpSal=" + perEmpSal + "]";
	}
	@Override
	public double calculateSal() {
		return noOfEmp*perEmpSal;
	}
	
	
	
	

}
