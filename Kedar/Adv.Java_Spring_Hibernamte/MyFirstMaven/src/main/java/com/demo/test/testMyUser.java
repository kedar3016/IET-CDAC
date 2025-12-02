package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.MyUser;
import com.demo.beans.Product;

public class testMyUser {
	public static void main(String arg[]) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		
		MyUser u1 = new MyUser(101,"Kedar","kedar3016@gmail.com");
		MyUser u2 = new MyUser(102,"Krishna","krishna@gmail.com");
		MyUser u3 = new MyUser(103,"Mayur","mayur016@gmail.com");
		MyUser u4 = new MyUser(104,"abc","abc016@gmail.com");
		
		Product p = new Product("Laptop",2,52300);
		Product p1 = new Product("Mouse",2,5300);
		Product p2 = new Product("Keyboard",1,2300);
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
//		session.save(u1);
//		session.save(u2);
//		session.save(u3);
//		session.save(u4);
		session.save(p);
		session.save(p1);
		session.save(p2);
		
		tr.commit();
		
		session.close();
		sf.close();
		
		
		
		
	}

}
