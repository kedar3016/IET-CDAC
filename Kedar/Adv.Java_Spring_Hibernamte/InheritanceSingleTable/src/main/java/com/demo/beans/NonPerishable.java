package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("nonperishable")
public class NonPerishable extends Product{
	private int Gurantee;

	public NonPerishable() {
		super();
	}

	public NonPerishable(int pid, String pname, int qty, LocalDate mfgDate,int gurantee) {
		super(pid,pname,qty,mfgDate);
		Gurantee = gurantee;
	}

	public int getGurantee() {
		return Gurantee;
	}

	public void setGurantee(int gurantee) {
		Gurantee = gurantee;
	}

	@Override
	public String toString() {
		return super.toString()+"NonPerishable [Gurantee=" + Gurantee + "]";
	}
	
	

}
