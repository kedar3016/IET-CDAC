package com.demo.Test;
import java.util.*;

import com.demo.service.EmployeeService;

public class TestEmployeeMngSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("-----------Employee Management System----------");
			System.out.println("1 : Add New Employee \n2 : displayAll\n0 : Exit");
			System.out.println("Enter Your Choice : ");
			ch = sc.nextInt();
			
		
			switch(ch) {
			
					case 1:	System.out.println("-------------Type Of Employee-------------");
							System.out.println("1 : Salaried Employee\n2 : Contract Employee\n3 : Vendor Employee");
							System.out.println("Enter Your Choice : ");
							int choice = sc.nextInt();
							boolean flag = EmployeeService.addNewEmp(choice);
							if(flag) {
								System.out.println("Employee added Succesfully !!!");
							}
							else {
								System.out.println("Error : Not Added!!");
							}
							break;
							
					case 2 : 
					case 0:	System.out.println("Thank You For Visiting !!!");
							break;
					default : System.out.println("Invalid Coice!!");
					
			}
			

		}while(ch != 0);

	}
	
}
