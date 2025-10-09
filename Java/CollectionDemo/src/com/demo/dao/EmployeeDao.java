package com.demo.dao;

import java.util.List;

import com.demo.bean.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAll();

	Employee findById(int eid);

	List<Employee> findByName(String ename);

	List<Employee> findByGsal(double sal);

	List<Employee> findByLsal(double sal);

	boolean updateSal(int id, double sal);

	boolean deleteEmpById(int id);

	boolean removeBySal(double sal);

	List<Employee> sortByEmpSal();

	List<Employee> sortById();

	List<Employee> sortByName();


	

}
