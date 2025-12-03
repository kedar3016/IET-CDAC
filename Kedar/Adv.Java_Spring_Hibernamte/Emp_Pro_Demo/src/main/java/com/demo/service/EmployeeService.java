package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmp();

	List<Employee> displayAll();

	boolean deleteById(int eid);

	boolean updateSalById(int eid, double sal);

	boolean assignProj(int eid, int pid);

}
