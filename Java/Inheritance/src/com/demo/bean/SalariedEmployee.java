package com.demo.bean;

import java.util.Date;

public class SalariedEmployee extends Employee{
	
			private double sal;
			private double bonus;
			public SalariedEmployee() {
				super();
			}
			public SalariedEmployee(String pName, Date bdate, String dept, String desg, double sal) {
				super("s",pName,bdate,dept,desg);
				this.sal = sal;
				this.bonus = sal*0.10;
			}
			public double getSal() {
				return sal;
			}
			public void setSal(double sal) {
				this.sal = sal;
			}
			public double getBonus() {
				return bonus;
			}
			public void setBonus(double bonus) {
				this.bonus = bonus;
			}
			public double calBonus(float percent) {
				bonus=sal*percent;
				return bonus;
			}
			
			@Override
			public double calculateSal() {
				return bonus + sal;
			}
			
			@Override
			public String toString() {
				return super.toString()+"SalariedEmployee [sal=" + sal + ", bonus=" + bonus + "]";
			}
			
			

}
