package com.demo.test;

import java.util.*;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import com.demo.service.ProjectService;
import com.demo.service.ProjectServiceImpl;

public class testEmpProjCrud {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmployeeService eservice;
		ProjectService pservice;
		int ch;
		
		
		do {
			System.out.println("\n"
					+ "0 : Exit\n"
					+ "1 : Add Employee\n"
					+ "2 : Add Project\n"
					+ "3 : Display All Employee\n"
					+ "4 : Delete Employee\n"
					+ "5 : Update Employee Salary \n"
					+ "6 : Assign Project ");
			
			System.out.println("\nEnter your choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
						
					case 1 ->{
						eservice = new EmployeeServiceImpl();
						boolean  flag = eservice.addNewEmp();
						
						if(flag) {
							System.out.println("Employee Added Succesfully!!");
						}
						else {
							System.out.println("Employee Not Added!!!");
						}
						
					}
					
					case 2 ->{
						pservice = new ProjectServiceImpl();
						boolean flag = pservice.addNewProject();
						if(flag) {
							System.out.println("Project Added Succesfully!!");
						}
						else {
							System.out.println("Project Not Added!!!");
						}
						
					}
					
					case 3 ->{
						eservice = new EmployeeServiceImpl();
						List<Employee> elist = eservice.displayAll();
						
						for(Employee e : elist) {
							System.out.println(e);
						}
					}
					
					case 6 ->{
						System.out.println("Enter the Employee Id : ");
						int eid = sc.nextInt();
						System.out.println("Enter Project Id : ");
						int pid = sc.nextInt();
						
					}
			}
			
		}while(ch != 0);
		

	}

}
