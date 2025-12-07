package com.demo.beans;

public class MyUser {
	private String uname;
	private String pass;
	private String role;
	public MyUser() {
		super();
	}
	public MyUser(String uname, String password, String role) {
		super();
		this.uname = uname;
		this.pass = password;
		this.role = role;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return pass;
	}
	public void setPassword(String password) {
		this.pass = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "MyUser [uname=" + uname + ", password=" + pass + ", role=" + role + "]";
	}
	

}
