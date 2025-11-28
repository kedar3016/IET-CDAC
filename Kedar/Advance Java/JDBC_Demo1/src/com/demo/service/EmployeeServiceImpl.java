package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import com.demo.bean.*;
import com.demo.dao.*;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDao edao = new EmployeeDaoImpl();
	@Override
	public boolean addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee No : ");
		int empno = sc.nextInt();
		System.out.println("Enter Employee Name : ");
		String ename = sc.next();
		System.out.println("Enter Gender : ");
		String gen = sc.next();
		System.out.println("Enter the Job : ");
		String job = sc.next();
		System.out.println("Enter Hiredate : ");
		String hdate = sc.next();
		LocalDate h1date = LocalDate.parse(hdate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println("Enter Salary : ");
		Float sal = sc.nextFloat();
		
		Employee e = new Employee(empno,ename,gen,job,h1date,sal);
		
		return edao.save(e);
		
	}
	@Override
	public List<Employee> displayEmp() {
		
		return edao.showEmployee();
		
	}
	@Override
	public Employee findById(int empId) {
		// TODO Auto-generated method stub
		return edao.searchById(empId);
	}
	@Override
	public boolean deleteById(int empId) {
		return edao.removeById(empId);
	}
	@Override
	public boolean updateEmployee(int empNo, String ename, double sal) {
		// TODO Auto-generated method stub
		return edao.updateById(empNo,ename,sal);
	}
	
	

}
