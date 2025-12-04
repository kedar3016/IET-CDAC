package com.demo.bean;

public class Skill {
	private int skid;
	private String skName;
	private int exp;
	public Skill() {
		super();
	}
	public Skill(int skid, String skName, int exp) {
		super();
		this.skid = skid;
		this.skName = skName;
		this.exp = exp;
	}
	public int getSkid() {
		return skid;
	}
	public void setSkid(int skid) {
		this.skid = skid;
	}
	public String getSkName() {
		return skName;
	}
	public void setSkName(String skName) {
		this.skName = skName;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Skill [skid=" + skid + ", skName=" + skName + ", exp=" + exp + "]";
	}
	

}
