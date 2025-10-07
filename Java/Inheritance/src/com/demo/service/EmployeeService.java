package com.demo.service;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.demo.bean.ContractEmployee;
import com.demo.bean.Employee;
import com.demo.bean.SalariedEmployee;
import com.demo.bean.VendorEmployee;

public class EmployeeService {
	static Employee []earr;
	static int cnt;
	
	static {
		earr = new Employee[50];
		earr[1] = new SalariedEmployee("Kedar",new Date(2003,04,03),"HR","Developer",85000);
		earr[1] = new SalariedEmployee("Revati",new Date(2000,04,23),"UX","Designer",99999);
		earr[2] = new ContractEmployee("Ameya",new Date(2000,04,23),"HR","Designer",80,3000);
		earr[3] = new ContractEmployee("Ashu",new Date(2000,04,23),"UX","Designer",80,4000);		   
		 
		cnt =4;
	}

	public static boolean addNewEmp(int ch) {
		Scanner sc = new Scanner(System.in);
		
		if(cnt<earr.length) {
		System.out.println("Enter the Employee id : ");
		int id = sc.nextInt();
		System.out.println("Enter the Name : ");
		String name = sc.next();
		System.out.println("Enter the Birth Of date (dd/mm/yyyy) : ");
		String date = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date bdate = null;
		try {
			bdate = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter the Department : ");
		String dept = sc.next();
		System.out.println("Enter the Desigination : ");
		String desg = sc.next();
		
		switch(ch) {
				case 1 : System.out.println("Enter the Salary : ");
				  		 double sal = sc.nextDouble();
				  		 earr[cnt] = new SalariedEmployee(name,bdate,dept,desg,sal);
				  		 cnt++;
				  		 break;
				case 2 : System.out.println("Enter the Hrs : ");
						 int hrs = sc.nextInt();
						 System.out.println("Enter the Charge per Hr : ");
						 int hrsCharge = sc.nextInt();
						 earr[cnt] = new ContractEmployee(name,bdate,dept,desg,hrs,hrsCharge);
						 break;
				case 3 : System.out.println("Enter the No of Employees : ");
				 		 int noOfEmp = sc.nextInt();
				 		 System.out.println("Enter the Per Employee Salary : ");
				 		 int perEmp = sc .nextInt();
				 		 earr[cnt] = new VendorEmployee(name,bdate,dept,desg,noOfEmp,perEmp);
				 		 break;
				default: System.out.println("Invalid Choic!! Try Again !!");
				
			}
		return true;
		
		}
		return false;
		
		
	}



	

}
