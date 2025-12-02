package com.demo.test;
import com.demo.beans.*;
import java.time.LocalDate;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmpPro {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee e1 = new Employee(11,"Krishna",100000.00,LocalDate.of(2026,02,9));
		Employee e2 = new Employee(12,"Kedar",200000.00,LocalDate.of(2026,05,12));
		Employee e3 = new Employee(13,"Saket",80000.00,LocalDate.of(2026,03,7));
		Employee e4 = new Employee(14,"Ayan",90000.00,LocalDate.of(2026,9,8));
		Set<Employee> eset1 = new HashSet<>();
		eset1.add(e1);
		eset1.add(e2);
		eset1.add(e3);
		Set<Employee> eset2 = new HashSet<>();
		eset2.add(e1);
		eset2.add(e3);
		eset2.add(e4);
		Project p1 = new Project(1,"Java",LocalDate.of(2025,12,27));
		Project p2 = new Project(2,"CPP",LocalDate.of(2025,10,12));
		Project p3 = new Project(3,"Python",LocalDate.of(2025,1,22));
		Set<Project> pset1 = new HashSet<>();
		pset1.add(p1);
		pset1.add(p3);
		e2.setPset(pset1);
		Set<Project> pset2 = new HashSet<>();
		pset2.add(p3);
		pset2.add(p2);
		pset2.add(p1);
		e1.setPset(pset2);
		Set<Project> pset3 = new HashSet<>();
		pset3.add(p1);
		pset3.add(p2);
		e3.setPset(pset3);
		e4.setPset(pset3);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		tr.commit();
		session.close();
		sf.close();
	}

}
