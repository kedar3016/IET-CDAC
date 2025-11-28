package com.demo.bean;

public class MyUser {
	private String uName;
	private String email;
	private String role;
	public MyUser() {
		super();
	}
	public MyUser(String uName, String email, String role) {
		super();
		this.uName = uName;
		this.email = email;
		this.role = role;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "MyUser [uName=" + uName + ", email=" + email + ", role=" + role + "]";
	}
	
}
