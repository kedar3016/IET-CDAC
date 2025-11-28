package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployee {

	public static void main(String[] args) {

		
		EmployeeService eservice = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		int ch;
		
		do {
			
			System.out.println("\n0: Exit \n1:Add New Employee \n2: Display Employee Data\n3: Search By Id"
					+ "\n4: Delete By Id\n5:Update By Id");
			System.out.println("Enter your Choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
			
				case 0 -> {
					System.out.println("Thank You for Visiting!!!");
				}
				case 1->{
					boolean flag = eservice.addNewEmployee();
					if(flag) {
						System.out.println("New Employee Added Successfully!!");
					}
					else {
						System.out.println("Error!!");
					}
				}
				
				case 2 ->{
					List<Employee> elist = eservice.displayEmp();
					
					elist.forEach(System.out::println);
				}
				
				case 3 ->{
					System.out.println("Enter the Employee No : ");
					int empId = sc.nextInt();
					Employee e = eservice.findById(empId);
					
					System.out.println(e);
				}
				
				case 4->{
					System.out.println("Enter the Employee No : ");
					int empId = sc.nextInt();
					
					boolean Status = eservice.deleteById(empId);
					if(Status) {
						System.out.println("Emplyee Deleted Successfully!!");
					}
					else {
						System.out.println("Employee Not Found!!!");
						
					}
					
				}
				
				case 5->{
					System.out.println("Enter Empno : ");
					int empNo = sc.nextInt();
					System.out.println("Enter Employee Name : ");
					String ename = sc.next();
					System.out.println("Enter Salary : ");
					double sal = sc.nextDouble();
					
					boolean flag = eservice.updateEmployee(empNo,ename,sal);
				}
				
			}
		}while(ch != 0);

	}

}
