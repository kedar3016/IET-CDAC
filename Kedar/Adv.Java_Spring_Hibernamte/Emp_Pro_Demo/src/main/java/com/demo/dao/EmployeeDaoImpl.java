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

	@Override
	public boolean removeById(int eid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		boolean flag = false;
	
		Employee e = session.get(Employee.class, eid);
		if(e != null) {
				session.delete(e);
				flag = true;
		}
		tr.commit();
		session.close();
		return flag;
		
	}

	@Override
	public boolean updateSal(int eid, double sal) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		boolean flag = false;
		Employee e = session.get(Employee.class, eid);
		
		if(e != null ) {
			e.setSal(sal);
			session.merge(e);
			flag = true;
		}
		
		tr.commit();
		session.close();
		return flag;
		
	}

	@Override
	public Employee findById(int eid) {
	List<Employee> elist = new ArrayList<>();
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee e = session.get(Employee.class, eid);
		
		tr.commit();
		session.close();
		
		return e;
	}

	@Override
	public boolean addExtraProject(Employee e, Project p) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		e.getPset().add(p);
		
		p.getEset().add(e);
		
		session.update(e);
		
		session.save(e);
		
		tr.commit();
		session.close();
		return true;
	}

}
