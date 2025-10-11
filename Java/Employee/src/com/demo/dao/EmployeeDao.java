package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	Set<Employee> show();

	Employee findById(int id);

	List<Employee> findByName(String name);

	List<Employee> findBySal(double sal);

	boolean updatBySal(int id, double sal);

	boolean removeById(int id);

	boolean removeBySal(double sal);

}
