package com.demo.dao;
import java.util.*;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public class EmployeeDaoImpl implements EmployeeDao {

	static SessionFactory sf;
	static {
		sf = HibernateUtil.getMySessionFactory();
	}
	
	@Override
	public boolean save(Employee e) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
		
		return true;
	
	}

	@Override
	public List<Employee> findAllEmp() {
		List<Employee> elist = new ArrayList<>();
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		elist = session.createQuery("from Employee", Employee.class).list();
		tr.commit();
		session.close();
		
		return elist;
	}

}
