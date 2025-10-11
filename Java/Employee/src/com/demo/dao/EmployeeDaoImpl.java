package com.demo.dao;

import java.time.LocalDate;
import java.util.*;
import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	static Set <Employee> eset;
	
	static {
		eset = new HashSet <>();
		eset.add(new Employee(101,"Krishna",50000,LocalDate.of(2025, 10, 21)));
		eset.add(new Employee(102,"Kedar",70000,LocalDate.of(2025, 9, 12)));
		eset.add(new Employee(103,"Pratik",60000,LocalDate.of(2025, 8, 11)));
		eset.add(new Employee(104,"Aditya",40000,LocalDate.of(2025, 7, 01)));
		eset.add(new Employee(104,"Aditya",40000,LocalDate.of(2025, 7, 01)));
	}

	@Override
	public boolean save(Employee e) {
		
		return eset.add(e);
	}

	@Override
	public Set<Employee> show() {
		
		return eset;
	}

	@Override
	public Employee findById(int id) {
		for(Employee e: eset) {
			if(e.getEmpId()==id){
				return e;
			}
		}
		return null;
	}

	@Override
	public List<Employee> findByName(String name) {
		List <Employee> e1= new ArrayList<>() ;
		for(Employee e:eset) {
			if(e.geteName().equals(name) ) {
				e1.add(e);
			}
		}
		return e1;
		}

	@Override
	public List<Employee> findBySal(double sal) {
		List <Employee> e2 = new ArrayList<>();
		for(Employee e:eset) {
			if(e.getSal()<sal) {
				e2.add(e);
			}
		}
		return e2;
	}

	@Override
	public boolean updatBySal(int id, double sal) {
		 Employee e  = findById(id);
		 if(e!=null) {
			 e.setSal(sal);
			 return true;
		 }
		 return false;
	}

	@Override
	public boolean removeById(int id) {
		 return eset.remove(new Employee(id));
	}

	@Override
	public boolean removeBySal(double sal) {
		
		return eset.removeIf(e->e.getSal()<sal);
	}



}
