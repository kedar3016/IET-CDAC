package com.demo.bean;

import java.util.Date;

abstract public class Employee extends Person {
		
		private String dept;
		private String desg;
		
		public Employee() {
			super();
			System.out.println("In a Employee Default Constructor");
		}
		
		public Employee(String empType, String pName, Date bdate, String dept, String desg) {
			super(empType,pName,bdate);
			this.dept = dept;
			this.desg = desg;
			System.out.println("In a Employee Para Constructor");
			
		}
		
		
		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		public String getDesg() {
			return desg;
		}

		public void setDesg(String desg) {
			this.desg = desg;
		}

		@Override
		public String toString() {
			return super.toString()+"Employee [sal=" + dept + ", bonus=" + desg + "]";
		}

		abstract public double calculateSal();
		
		
		
}
