package com.demo.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import com.demo.beans.*;
import com.demo.dao.*;


public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDao edao = new EmployeeDaoImpl();
	
	@Override
	public boolean addNewEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp Id");
		int empid = sc.nextInt();
		System.out.println("Enter emp Name");
		String ename = sc.next();
		System.out.println("Enter emp Salary");
		double salary = sc.nextDouble();
		System.out.println("Enter emp Joining Date");
		String dt= sc.next();
		LocalDate jdt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e = new Employee(empid,ename,salary,jdt);
		
		return edao.save(e);
	}

	@Override
	public Set<Employee> displayAll() {
	
		return edao.show();
	}

	@Override
	public Employee findById(int id) {
		
		return edao.findById(id);
	}

	@Override
	public List<Employee> findByName(String name) {
		
		return edao.findByName(name);
	}

	@Override
	public List<Employee> searchBySal(double sal) {
		
		return edao.findBySal(sal);
	}

	@Override
	public boolean updateBySal(int id, double sal) {
		return edao.updatBySal(id,sal);
	}

	@Override
	public boolean deleteById(int id) {
		return edao.removeById(id);
	}

	@Override
	public boolean deleteBySal(double sal) {
		return edao.removeBySal(sal);
	}


	
	

}
