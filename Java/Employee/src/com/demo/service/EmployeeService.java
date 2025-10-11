package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmp();

	Set<Employee> displayAll();

	Employee findById(int id);

	List<Employee> findByName(String name);

	List<Employee> searchBySal(double sal);

	boolean updateBySal(int id, double sal);

	boolean deleteById(int id);

	boolean deleteBySal(double sal);

}
