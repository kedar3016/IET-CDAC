package com.demo.bean;

import java.util.Date;

public class ContractEmployee extends Employee {
	
	private int hrs;
	private int hrCharges;
	public ContractEmployee() {
		super();
		System.out.println("In a ContractEmployee Default Constructor");
	}
	public ContractEmployee(String pName, Date bdate, String dept, String desg, int hrs, int hrCharges) {
		super("c",pName,bdate,dept,desg);
		this.hrs = hrs;
		this.hrCharges = hrCharges;
		System.out.println("In a ContractEmployee Para Constructor");
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getHrCharges() {
		return hrCharges;
	}
	public void setHrCharges(int hrCharges) {
		this.hrCharges = hrCharges;
	}
	@Override 
	public double calculateSal() {
		return hrs*hrCharges;
	}
	@Override
	public String toString() {
		return super.toString()+"ContractEmployee [hrs=" + hrs + ", hrCharges=" + hrCharges + "]";
	}
	
	

}
