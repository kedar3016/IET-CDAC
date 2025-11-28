package com.demo.bean;

import java.time.LocalDate;

public class Employee {
	private int empno;
	private String ename;
	private String gender;
	private String job;
	private LocalDate hdate;
	private double sal;
	public Employee(int empno, String ename, String gender, String job, LocalDate hdate, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.gender = gender;
		this.job = job;
		this.hdate = hdate;
		this.sal = sal;
	}
	public Employee() {
		super();
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public LocalDate getHdate() {
		return hdate;
	}
	public void setHdate(LocalDate hdate) {
		this.hdate = hdate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", gender=" + gender + ", job=" + job + ", hdate="
				+ hdate + ", sal=" + sal + "]";
	}
	
	
	
	
	
	
}
