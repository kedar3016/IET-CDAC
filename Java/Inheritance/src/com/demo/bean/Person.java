package com.demo.bean;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract public class Person {
	
		static int scount,ccount,vcount;
		private String pId;
		private String pName;
		private Date bdate;
		
		static {
			scount = 0;
			ccount = 0;
			vcount = 0;
		}

		public Person() {
			super();
			pId=generateId("s");
			pName=null;
			bdate=null;
			System.out.println("In a Person Default Constructor");
		}

		public Person(String empType, String pName, Date bdate) {
			super();
			pId = generateId(empType);
			this.pName = pName;
			this.bdate = bdate;
			System.out.println("In a Person Para Constructor");
		}

		public String getpId() {
			return pId;
		}

//		public void setpId(String pId) {
//			this.pId = pId;
//		}

		public String generateId(String empType) {
			if(empType.equals("s")) {
				scount++;
				return empType+scount;
			}
			else if(empType.equals("c")) {
				ccount++;
				return empType+ccount;
			}
			else if(empType.equals("v")) {
				vcount++;
				return empType+ccount;
			}
			else {
				return null;
			}
		}
		public String getpName() {
			return pName;
		}

		public void setpName(String pName) {
			this.pName = pName;
		}

		public Date getBdate() {
			return bdate;
		}

		public void setBdate(Date bdate) {
			this.bdate = bdate;
		}

		@Override
		public String toString() {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			String str = sdf.format(bdate);
			return "Person [pId=" + pId + ", pName=" + pName + ", bdate=" + str + "]";
		}
		abstract public double calculateSal();
		
		

}
