package com.demo.service;

import java.util.List;

import com.demo.bean.Employee;

public interface EmployeeService {

	boolean addNewEmp();

	List<Employee> displayAll();

	Employee searchById(int eid);

	List<Employee> searchByName(String ename);


	List<Employee> searchByGSal(double sal);

	List<Employee> searchByLSal(double sal);

	boolean modifySal(int id, double sal);

	boolean deleteById(int id);

	boolean deleteBySal(double sal);

	List<Employee> sortBySal();

	List<Employee> sortById();

	List<Employee> sortByName();
	
	

}
