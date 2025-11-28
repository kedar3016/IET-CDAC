package com.demo.service;

import java.util.List;

import com.demo.bean.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> displayEmp();

	Employee findById(int empId);

	boolean deleteById(int empId);

	boolean updateEmployee(int empNo, String ename, double sal);

}
