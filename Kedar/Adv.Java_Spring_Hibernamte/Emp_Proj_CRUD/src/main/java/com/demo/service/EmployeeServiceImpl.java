package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDao edao = new EmployeeDaoImpl();
	
	@Override
	public boolean addNewEmployee() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Emp Id : ");
		int eid = sc.nextInt();
		System.out.println("Enter the Employee Name : ");
		String ename = sc.next();
		System.out.println("Enter the Hire Date (dd/mm/yyyy) : ");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Enter the Employee Salary : ");
		double sal = sc.nextDouble();
		
		Employee e = new
		
		return edao.save(e);
	}

}
