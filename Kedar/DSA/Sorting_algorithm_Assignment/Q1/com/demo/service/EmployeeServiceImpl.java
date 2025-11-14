package com.demo.service;

import java.util.Scanner;

import com.demo.bean.*;
import com.demo.dao.*;

public class EmployeeServiceImpl implements EmployeeService{
	Scanner sc = new Scanner(System.in);
		EmployeeDao edao = new EmployeeDaoImpl();
	@Override
	public void bubbleSort() {
		edao.bubblesort();
		
	}
	@Override
	public void display() {
		edao.showData();
		
	}
	@Override
	public boolean insert() {
		System.out.println("Enter Employee Id : ");
		int id = sc.nextInt();
		System.out.println("Employee Name : ");
		String name  = sc.next();
		System.out.println("Employee Salary : ");
		double sal = sc.nextDouble();
		Employee e = new Employee(id,name,sal);
		return edao.insertEmp(e);
	}
	 
}
