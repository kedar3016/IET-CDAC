package com.demo.beans;

import javax.persistence.*;

@Entity
@Table(name = "Emp3")
public class Employee {
	@Id
	@GeneratedValue
	private int eid;
	private String ename;
	private double sal;
	private String dept;
	private int age;
	public Employee(String ename, double sal, String dept, int age) {
		super();
		
		this.ename = ename;
		this.sal = sal;
		this.dept = dept;
		this.age = age;
	}
	public Employee(int eid, String ename, double sal, String dept, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.dept = dept;
		this.age = age;
	}
	public Employee() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", dept=" + dept + ", age=" + age + "]";
	}
	
	
	
}
