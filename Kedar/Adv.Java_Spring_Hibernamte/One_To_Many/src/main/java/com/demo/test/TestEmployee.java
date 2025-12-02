package com.demo.test;
import com.demo.beans.*;

import java.time.LocalDate;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class TestEmployee {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Department d1 = new Department( 101, "Finance", "Mumbai");
		Department d2 = new Department( 102, "Health", "Hyderabad");
		Employee e1 = new Employee(11,"Krishna",100000,LocalDate.of(2026,02,9),d1);
		Employee e2 = new Employee(12,"Kedar",200000,LocalDate.of(2026,05,12),d1);
		Employee e3 = new Employee(13,"Saket",80000,LocalDate.of(2026,03,7),d2);
		Employee e4 = new Employee(14,"Ayan",90000,LocalDate.of(2026,9,8),d2);
		Set<Employee> set1 = new HashSet<>();
		set1.add(e1);
		set1.add(e2);
		Set<Employee> set2 =  new HashSet<>();
		set2.add(e3);
		set2.add(e4);
		d1.setEset(set1);
		d2.setEset(set2);
		session.save(d1);
		session.save(d2);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		tr.commit();
		session.close();
		sf.close();

	}

}
