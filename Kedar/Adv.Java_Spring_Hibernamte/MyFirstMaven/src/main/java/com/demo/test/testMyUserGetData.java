package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Product;

public class testMyUserGetData {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Product p = session.get(Product.class,1);
		Product p1 = session.get(Product.class, 2);
		
		tr.commit();
		System.out.println(p);
		System.out.println(p1);
		
		session.close();
		sf.close();

	}

}
