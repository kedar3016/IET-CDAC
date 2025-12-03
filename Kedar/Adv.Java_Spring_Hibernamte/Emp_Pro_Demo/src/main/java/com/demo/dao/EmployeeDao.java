package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAllEmp();

	boolean removeById(int eid);

	boolean updateSal(int eid, double sal);

	Employee findById(int eid);

	boolean addExtraProject(Employee e, Project p);

	

}
