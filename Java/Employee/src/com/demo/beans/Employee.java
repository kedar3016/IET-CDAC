package com.demo.beans;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private int empId;
	private String eName;
	private double sal;
	private LocalDate joinDt;
	public int getEmpId() {
		return empId;
	}
	
	public Employee(int empId) {
		super();
		this.empId = empId;
	}

	public Employee(int empId, String eName, double sal, LocalDate joinDt) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.sal = sal;
		this.joinDt = joinDt;
	}

	public Employee() {
		super();
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
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public LocalDate getJoinDt() {
		return joinDt;
	}
	public void setJoinDt(LocalDate joinDt) {
		this.joinDt = joinDt;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", sal=" + sal + ", joinDt=" + joinDt + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.empId == ((Employee)obj).empId;
	}
	

	
	
}
