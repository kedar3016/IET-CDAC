package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Category {
	@Value("101")
	private int cid;
	@Value("Electronics")
	private String cname;
	@Value("Technology")
	private String des;
	public Category() {
		super();
	}
	public Category(int cid, String cname, String des) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.des = des;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + ", des=" + des + "]";
	}
	

}
