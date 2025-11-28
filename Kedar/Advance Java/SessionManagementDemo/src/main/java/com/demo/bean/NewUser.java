package com.demo.bean;

import java.time.LocalDate;

public class NewUser {
	private String uname; 
	private String email;
    private String role;
    private String pass;       
    private String address;
    private LocalDate dob;        
    private String gender;
    private String hobbies;    
    private String locations;
	public NewUser(String uname,String email, String role, String pass, String address, LocalDate dob, String gender, String hobbies,
			String locations) {
		super();
		this.uname = uname;
		this.email = email;
		this.role = role;
		this.pass = pass;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
		this.hobbies = hobbies;
		this.locations = locations;
	}
	public String getUname() {
		return uname;
	}
	public String getEmail() {
		return email;
	}
	public void setUname(String uname) {
		this.uname = uname;
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
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getLocations() {
		return locations;
	}
	public void setLocations(String locations) {
		this.locations = locations;
	}
	@Override
	public String toString() {
		return "NewUser [uname=" + uname + ",email=" + email + ", role=" + role + ", pass=" + pass + ", address=" + address + ", dob=" + dob
				+ ", gender=" + gender + ", hobbies=" + hobbies + ", locations=" + locations + "]";
	}

}
