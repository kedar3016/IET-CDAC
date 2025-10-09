package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import com.demo.bean.*;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao eDao;
	
	
	public EmployeeServiceImpl() {
		eDao = new EmployeeDaoImpl();
	}
	
	@Override
	public boolean addNewEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Id : ");
		int id =  sc.nextInt();
		System.out.println("Enter the Employee Name : ");
		String nm = sc.next();
		System.out.println("Enter the Salary : ");
		double sal = sc.nextDouble();
		System.out.println("Enter Joining Date (DD/MM/YYYY) : ");
		String  jdt = sc.next();
		LocalDate dt = LocalDate.parse(jdt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e = new Employee(id,nm,sal,dt);
		return eDao.save(e);
		
	}
	

	@Override
	public List<Employee> displayAll() {
		return eDao.findAll();
	}

	@Override
	public Employee searchById(int eid) {
		return eDao.findById(eid);
	}

	@Override
	public List<Employee> searchByName(String ename) {
		return eDao.findByName(ename);
	}

	@Override
	public List<Employee> searchByGSal(double sal) {
		return eDao.findByGsal(sal);
	}

	@Override
	public List<Employee> searchByLSal(double sal) {
		return eDao.findByLsal(sal);
	}

	@Override
	public boolean modifySal(int id,double sal) {
		return eDao.updateSal(id,sal);
	}

	@Override
	public boolean deleteById(int id) {
		return eDao.deleteEmpById(id);
	}

	@Override
	public boolean deleteBySal(double sal) {
		return eDao.removeBySal(sal);
	}

	@Override
	public List<Employee> sortBySal() {
		return eDao.sortByEmpSal();
	}

	@Override
	public List<Employee> sortById() {
		return eDao.sortById();
	}

	@Override
	public List<Employee> sortByName() {
		return eDao.sortByName();
	}


	



	

}
