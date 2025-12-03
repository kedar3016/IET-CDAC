package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.*;

@Entity

@DiscriminatorValue("perishable")
public class Perishable extends Product{
	
	private LocalDate expDate;

	public Perishable() {
		super();
	}

	public Perishable(int pid, String pname, int qty, LocalDate mfgDate,LocalDate expDate) {
		super(pid,pname,qty,mfgDate);
		this.expDate = expDate;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return super.toString()+"Perishable [expDate=" + expDate + "]";
	}
	
	
	

}
