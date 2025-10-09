package com.demo.Test;

import java.util.*;

import com.demo.bean.Employee;
import com.demo.service.*;

public class TestEmployeeManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService eservice = new EmployeeServiceImpl();
		
		int ch = 0;
		
		do {
			
			System.out.println("1 : Add New Employee \n2 : DisplayAll\n3 : Search By Id"
					+ "\n4 : Search By Name\n5 : Search By Salary\n6 : Modified Salary"
					+ "\n7 : Delete By Id \n8 : Delete By Salary\n9 : Sort By Salary"
					+ "\n10 : Sort By ID\n11 : Sort By Name\n12 : Exit");
			System.out.println("Enter Your Choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
			
//---------------------------------------Accept Employee Data----------------------------------------------------------
					case 1 ->{
						boolean flag = eservice.addNewEmp();
						if(flag) {
							System.out.println("Employee Added Succesfully!!");
						}
						else {
							System.out.println("Error : Not Found!!");
							}
						}
					
					
//---------------------------------------Display Employee Data------------------------------------------------
					
					case 2 ->{
						List <Employee> elist = eservice.displayAll();
						
						elist.forEach(System.out::println);
					}
					
					
//-------------------------------------Search  By Id --------------------------------------------------------------
					case 3 ->{
								System.out.println("Enter the Employee Id : ");
								int eid = sc.nextInt();
								Employee e1 = eservice.searchById(eid);
								if(e1!=null) {
									System.out.println(e1);
								}
								else {
									System.out.println("Not Found!!!!");
								}
					}
					
					
//--------------------------------------Search By Name -----------------------------------------------------------
					
					case 4 ->{
								System.out.println("Enter The Employee name ");
								String ename = sc.next();
								List <Employee> lst = eservice.searchByName(ename);
								
								if(lst != null) {
											lst.forEach(System.out::println);
								}
								else {
									System.out.println("Not Found!!!");
								}
					}
				
//------------------------------------Search By Salary----------------------------------------
					case 5 ->{
								System.out.println("Enter the Employee Salary : ");
								double sal = sc.nextDouble();
								System.out.println("1 : Greater Than salary\n2 : Less Than salary");
								System.out.println("Enter your Choice : ");
								int ch1 = sc.nextInt();
								
								List <Employee> eSal;
								switch(ch1) {
											case 1 -> {
												eSal = eservice.searchByGSal(sal);
												if(eSal!=null) {
													eSal.forEach(System.out::println);
												}
												else {
													System.out.println("Not Found!!");
												}
											}
											case 2 ->{
												eSal = eservice.searchByLSal(sal);
												if(eSal!=null) {
													eSal.forEach(System.out::println);
												}
												else {
													System.out.println("Not Found!!");
												}
											}
											default ->{System.out.println("Invalid Choice!!");}
								}
								
				
					}
					
//---------------------------------------Modify Salary----------------------------------------------------------
					case 6 ->{
									System.out.println("Enter the Emp Id : ");
									int id = sc.nextInt();
									System.out.println("Enter Updated Salary : ");
									double sal = sc.nextDouble();
									boolean flag = eservice.modifySal(id,sal);
									if(flag) {
										System.out.println("Salary Updated Sucessfully !!");
									}
									else {
										System.out.println("Error : Not Found");
									}
						
					}
					
					
//-------------------------------------Delete By ID----------------------------------------------------------
					case 7 ->{
								System.out.println("Enter the Emp Id : ");
								int id = sc.nextInt();
								boolean flag = eservice.deleteById(id);
								if(flag) {
									System.out.println("Employee Data Deleted Sucessfully !!");
								}
								else {
									System.out.println("Error : Not Found");
								}
								
								
					}
					
					
//-------------------------------------Delete By Salary-----------------------------------------------------------
					case 8 ->{
								System.out.println("Enter the Employee Salary : ");
								double sal = sc.nextDouble();
								boolean flag = eservice.deleteBySal(sal);
								if(flag) {
									System.out.println("Employee Data Deleted Sucessfully !!");
								}
								else {
									System.out.println("Error : Not Found");
								}
										
					}
					
		
//----------------------------------------Sort By Salary---------------------------------------------------------
					case 9 ->{
								List<Employee> e1 = eservice.sortBySal();
								System.out.println("Sorted Data by Salary!!!!");
								e1.forEach(System.out::println);
					}
					
//---------------------------------------Sort By ID----------------------------------------------------------------
					case 10 ->{
								List<Employee> e1 = eservice.sortById();
								System.out.println("Sorted Data By Employee ID!!!!");
								e1.forEach(System.out::println);
								
						
					}
					
//--------------------------------------Sort By Name----------------------------------------------------------------
					case 11 ->{
						List<Employee> e1 = eservice.sortByName();
						System.out.println("Sorted Data By Employee ID!!!!");
						e1.forEach(System.out::println);
					}
					
					
					
					
//------------------------------------------Exit-------------------------------------------------------------------
					
					case 12 ->{ sc.close();
				     			System.out.println("Thank you for visiting....");}

					
//--------------------------------------Invalid Choice-------------------------------------------------------------					

					default ->{System.out.println("Imvalid Choice!!!!");}
				
					
//=================================================================================================================
			}
		}while(ch != 12);

	}

}
