package com.demo.beans;

public class MyUser {
	private int uid;
	private String uname;
	private String Addr;
	public MyUser() {
		super();
	}
	public MyUser(int uid, String uname, String addr) {
		super();
		this.uid = uid;
		this.uname = uname;
		Addr = addr;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getAddr() {
		return Addr;
	}
	public void setAddr(String addr) {
		Addr = addr;
	}
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", Addr=" + Addr + "]";
	}
	

}
