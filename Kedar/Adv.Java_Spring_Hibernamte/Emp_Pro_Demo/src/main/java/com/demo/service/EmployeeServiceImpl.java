package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.demo.beans.Employee;
import com.demo.beans.Project;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.dao.*;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao edao = new EmployeeDaoImpl();
	@Override
	public boolean addNewEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Emp id : ");
		int eid = sc.nextInt();
		System.out.println("Enter Employee Name : ");
		String ename = sc.next();
		System.out.println("Enter Hiredate : ");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Enter the Salary : ");
		double sal = sc.nextDouble();
		
		System.out.println("Enter the Project Id eg.(1,2,...) : ");
		String pid = sc.next();
		
		String parr[] = pid.split(",");
		ProjectDao pdao = new ProjectDaoImpl();
		
		Set<Project> pset = pdao.findByPid(parr);
		
		
		Employee e = new Employee(eid,ename,ldt,sal);
		e.setPset(pset);
		return edao.save(e);
	}
	@Override
	public List<Employee> displayAll() {
		// TODO Auto-generated method stub
		return edao.findAllEmp();
	}

}
