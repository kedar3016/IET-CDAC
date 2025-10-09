package com.demo.dao;

import java.time.LocalDate;
import java.util.*;
import com.demo.bean.Employee;
import com.demo.comparators.*;

public class EmployeeDaoImpl implements EmployeeDao{
	
	static List<Employee> elist;
	List<Employee> temp = new ArrayList<>();
	
	static {
		elist = new ArrayList<>();
		elist.add(new Employee(100,"Manjiri",45678,LocalDate.of(2024, 11, 12)));
    	elist.add(new Employee(101,"Gauri",55678,LocalDate.of(2023, 11, 12)));
    	elist.add(new Employee(103,"Kanchan",35678,LocalDate.of(2020, 11, 12)));
	}
	
	
	
	@Override
	public boolean save(Employee e) {
		elist.add(e);
		return true;
	}

	@Override
	public List<Employee> findAll() {
		return elist;
	}
	

	@Override
	public Employee findById(int eid) {
		int pos = elist.indexOf(new Employee(eid));
		
		if(pos != -1) {
			return elist.get(pos);
		}
		return null;
	}

	@Override
	public List<Employee> findByName(String ename) {
		List<Employee> temp = new ArrayList<>();
		for(Employee e : elist) {
			if(e.geteName().equals(ename)) {
				temp.add(e);
			}
			
		}
		if(temp.size()>0) {
				return temp;
		}
		return null;
	}

	@Override
	public List<Employee> findByGsal(double sal) {
		List <Employee> temp = new ArrayList<>();
		for(Employee e : elist) {
			if(e.getSal()>sal) {
				temp.add(e);
			}
		}
		if(temp.size()>0) {
			return temp;
		}
		return null;
	}

	@Override
	public List<Employee> findByLsal(double sal) {
		List <Employee> temp = new ArrayList<>();
		for(Employee e : elist) {
			if(e.getSal()<sal) {
				temp.add(e);
			}
		}
		if(temp.size()>0) {
			return temp;
		}
		return null;
	}

	@Override
	public boolean updateSal(int id,double sal) {
		Employee e = findById(id);
		if(e!=null) {
				e.setSal(sal);
				return true;
		}
		return false;
	}

	@Override
	public boolean deleteEmpById(int id) {
		
		return elist.remove(new Employee(id));
		
	}

	@Override
	public boolean removeBySal(double sal) {
		
		
		return elist.removeIf(e->e.getSal()<sal);
		

	}

	@Override
	public List<Employee> sortByEmpSal() {
		List<Employee> lst = new ArrayList();
		for(Employee e:elist) {
			lst.add(e);
		}
		
		lst.sort(null);
		return lst;
	}

	@Override
	public List<Employee> sortById() {
		List<Employee> lst = new ArrayList();
		for(Employee e:elist) {
			lst.add(e);
		}
		
		lst.sort(new MyIdComparator());
		return lst;
	}

	@Override
	public List<Employee> sortByName() {
		List<Employee> lst = new ArrayList();
		for(Employee e:elist) {
			lst.add(e);
		}
		
		lst.sort(new MyNameComparator());
		return lst;
		
	}

	

	

}
