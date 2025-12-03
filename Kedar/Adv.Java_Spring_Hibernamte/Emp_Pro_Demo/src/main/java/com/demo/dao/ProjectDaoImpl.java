package com.demo.dao;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Project;

public class ProjectDaoImpl implements ProjectDao{
	
	static SessionFactory sf;
	
	static {
		sf = HibernateUtil.getMySessionFactory();
		
		
	}

	@Override
	public Set<Project> findByPid(String parr[]) {
		Set<Project> pset = new HashSet<>();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		for(String pid : parr) {
			Project p = session.get(Project.class,Integer.parseInt(pid));
			pset.add(p);
		}
		tr.commit();
		session.close();
		return pset;
		
		
	}

	@Override
	public boolean save(Project p) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(p);
		tr.commit();
		session.close();
		return true;
	}

	@Override
	public Project findByPid(int pid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Project p = session.get(Project.class, pid);
		tr.commit();
		session.close();
		return p;
	}

	@Override
	public List<Project> showAllProject() {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		List<Project> plist = session.createQuery("select p from Project p",Project.class).list();
		tr.commit();
		session.close();
		return plist;
	}

	@Override
	public boolean modifyByPid(int pid, String pname) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		boolean flag = false;
		Project p = session.get(Project.class, pid);
		
		if(p!=null) {
			p.setPname(pname);
			session.merge(p);
			flag = true;
		}
		
		tr.commit();
		session.close();
		return flag;
	}

	@Override
	public boolean removeByPid(int pid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		boolean flag = false;
		
		Project p = session.get(Project.class, pid);
		if(p!=null) {
					session.delete(p);
					flag = true;
		
		}
		tr.commit();
		session.close();
		return flag;
	}

}
