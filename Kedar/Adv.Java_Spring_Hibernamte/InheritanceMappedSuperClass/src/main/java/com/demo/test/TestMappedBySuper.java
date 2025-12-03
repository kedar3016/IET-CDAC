package com.demo.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.NonPerishable;
import com.demo.beans.Perishable;
import com.demo.beans.Product;

public class TestMappedBySuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Product p = new Perishable(101,"oil",12,LocalDate.of(2025, 12, 03),LocalDate.of(2026,02,15));
		Product p1 = new NonPerishable(102,"chair",12,LocalDate.of(2025, 12, 03),2);
		session.save(p);
		session.save(p1);
		
		tr.commit();
		session.close();
		sf.close();
		
		

	}

}
