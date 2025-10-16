package com.demo.bean;

public class Employee {
	private int eId;
	private String eName;
	private String desg;
	private double sal;
	public Employee() {
		super();
	}
	public Employee(int eId, String eName, String desg, double sal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.desg = desg;
		this.sal = sal;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", desg=" + desg + ", sal=" + sal + "]";
	}
	
	

}
