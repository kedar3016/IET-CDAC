package com.demo.test;

import java.util.*;

import com.demo.beans.Employee;
import com.demo.beans.Project;
import com.demo.dao.HibernateUtil;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import com.demo.service.ProjectService;
import com.demo.service.ProjectServiceImpl;

public class testEmpProjCrud {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmployeeService eservice = new EmployeeServiceImpl();
		ProjectService pservice = new ProjectServiceImpl();
		int ch;
		
		
		do {
			System.out.println("\n"
					+ "0 : Exit\n"
					+ "1 : Add Employee\n"
					+ "2 : Add Project\n"
					+ "3 : Display All Employee\n"
					+ "4 : Delete Employee\n"
					+ "5 : Update Employee Salary \n"
					+ "6 : Assign Project \n"
					+ "7 : Display Project\n"
					+ "8 : Update Project\n"
					+ "9 : Delete Project");
			
			System.out.println("\nEnter your choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
						
					case 1 ->{
						
						boolean  flag = eservice.addNewEmp();
						
						if(flag) {
							System.out.println("Employee Added Succesfully!!");
						}
						else {
							System.out.println("Employee Not Added!!!");
						}
						
					}
					
					case 2 ->{
						
						boolean flag = pservice.addNewProject();
						if(flag) {
							System.out.println("Project Added Succesfully!!");
						}
						else {
							System.out.println("Project Not Added!!!");
						}
						
					}
					
					case 3 ->{
						
						List<Employee> elist = eservice.displayAll();
						
						for(Employee e : elist) {
							System.out.println(e);
						}
					}
					
					
					case 4 ->{
						System.out.println("Enter the Id : ");
						int eid = sc.nextInt();
						boolean status = eservice.deleteById(eid);
						if(status) {
							System.out.println("Delete Succesfully!!");
						}
						else {
							System.out.println("Not Found !");
						}
						
					}
					
					case 5 ->{
						System.out.println("Enter  Eid : ");
						int eid = sc.nextInt();
						System.out.println("Enter Updated salary : ");
						double sal = sc.nextDouble();
						boolean flag = eservice.updateSalById(eid,sal);
						
						if(flag) {
							System.out.println("Employee Data Updated Succesfully!!");
						}
						else {
							System.out.println("Not Found!!");
						}
					}
					case 6 ->{
						System.out.println("Enter the Employee Id : ");
						int eid = sc.nextInt();
						System.out.println("Enter Project Id : ");
						int pid = sc.nextInt();
						
						boolean flag = eservice.assignProj(eid,pid);
						if(flag) {
							System.out.println("Project Assign Successfully!");
						}
						else {
							System.out.println("Not Updated!!");
						}
					}
					
					
					case 7 ->{
						List<Project> plist= pservice.displayAllProject();
						plist.stream().forEach(System.out::println);
						
					}
					
					case 8 ->{
						System.out.println("Enter the Project Id : ");
						int pid = sc.nextInt();
						System.out.println("Enter the New Project Name : ");
						String pname = sc.next();
						boolean flag = pservice.updateByPid(pid,pname);
		
						if(flag) {
							System.out.println("Project Updated!!");
						}
						else {
							System.out.println("Project Not Updated!!!");
						}
					}
					
					
					case 9 ->{
						System.out.println("Enter the Project Id : ");
						int pid = sc.nextInt();
						boolean flag = pservice.deleteByPid(pid);
						if(flag) {
							System.out.println("Project Deleted Succesfully!!");
						}
						else {
							System.out.println("Not Found!!");
						}
					}
					
					case 0 ->{
						HibernateUtil.closeSessionFactory();
						System.out.println("Thank You For Visiting!!!!!");
					}
			}
			
		}while(ch != 0);
		

	}

}
