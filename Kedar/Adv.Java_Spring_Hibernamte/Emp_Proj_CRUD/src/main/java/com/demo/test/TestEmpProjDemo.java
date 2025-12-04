package com.demo.test;

import java.util.*;

import com.demo.service.*;

public class TestEmpProjDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService eservice = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		int ch;
		
		do {
			
			System.out.println("1 : Add new Emoployee\n"
					+ "2 : Add new Project\n"
					+ "3 : Display All Employee\n"
					+ "4 : Find Employee By id\n"
					+ "0 : Exit");
			System.out.println("Enter the Your choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
				
			
					case 1 ->{
						boolean flag = eservice.addNewEmployee();
					}
			}
		}while(ch != 0);

	}

}
