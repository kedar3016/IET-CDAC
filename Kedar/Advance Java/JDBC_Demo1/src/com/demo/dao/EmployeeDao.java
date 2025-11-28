package com.demo.dao;

import java.util.List;

import com.demo.bean.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee>  showEmployee();

	Employee searchById(int empId);

	boolean removeById(int empId);

	boolean updateById(int empNo, String ename, double sal);

}
