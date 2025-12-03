package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "Perishable")
public class Perishable extends Product{
	private LocalDate expDate;

	

	public LocalDate getExpDate() {
		return expDate;
	}


	@Override
	public String toString() {
		return super.toString()+"Perishable [expDate=" + expDate + "]";
	}


	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}


	public Perishable(int pid, String pname, int qty, LocalDate mfgDate, LocalDate expDate) {
		super(pid, pname, qty, mfgDate);
		this.expDate = expDate;
	}
	

}
