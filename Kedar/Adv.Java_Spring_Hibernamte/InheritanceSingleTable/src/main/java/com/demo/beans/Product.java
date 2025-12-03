package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name ="Product1")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="ptype",discriminatorType = DiscriminatorType.STRING)
public class Product {
	@Id
	private int pid;
	private String pname;
	private int qty;
	private LocalDate mfgDate;
	public Product() {
		super();
	}
	public Product(int pid, String pname, int qty, LocalDate mfgDate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.mfgDate = mfgDate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public LocalDate getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", mfgDate=" + mfgDate + "]";
	}
	
	

}
