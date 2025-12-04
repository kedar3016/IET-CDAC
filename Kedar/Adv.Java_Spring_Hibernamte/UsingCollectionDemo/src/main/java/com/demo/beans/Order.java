package com.demo.beans;

import java.util.*;

public class Order {
	private int ordid;
	private String cname;
	private List<Products> plist;
	public Order() {
		super();
	}
	public Order(int ordid, String cname, List<Products> plist) {
		super();
		this.ordid = ordid;
		this.cname = cname;
		this.plist = plist;
	}
	public int getOrdid() {
		return ordid;
	}
	public void setOrdid(int ordid) {
		this.ordid = ordid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Products> getPlist() {
		return plist;
	}
	public void setPlist(List<Products> plist) {
		this.plist = plist;
	}
	@Override
	public String toString() {
		return "Order [ordid=" + ordid + ", cname=" + cname + ", plist=" + plist + "]";
	}
	
}
