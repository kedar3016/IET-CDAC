package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAllEmp();

}
