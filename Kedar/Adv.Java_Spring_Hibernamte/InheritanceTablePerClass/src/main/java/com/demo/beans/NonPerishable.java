package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="NonPerishable")

public class NonPerishable extends Product{
	private int gurantee;

	public NonPerishable(int pid, String pname, int qty, LocalDate mfgDate, int gurantee) {
		super(pid, pname, qty, mfgDate);
		this.gurantee = gurantee;
	}

	public NonPerishable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getGurantee() {
		return gurantee;
	}

	public void setGurantee(int gurantee) {
		this.gurantee = gurantee;
	}

	@Override
	public String toString() {
		return super.toString()+"NonPerishable [gurantee=" + gurantee + "]";
	}

	
	

}
