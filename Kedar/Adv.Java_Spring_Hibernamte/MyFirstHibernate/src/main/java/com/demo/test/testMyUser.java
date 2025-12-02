package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.*;

public class testMyUser {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		//create a MyUser object
		//both u1 and u2 are in transient state
		Myuser u1=new Myuser(13,"Kishori", "kkk@gmail.com");
		Myuser u2=new Myuser(14,"Anil", "aaa@gmail.com");
		Product p1=new Product("table",23,54000);
		Product p2=new Product("chair",30,4000);
		//Session session=sf.getCurrentSession();
		
		Session session=sf.openSession();
		
		Transaction tr=session.beginTransaction();
		//saving object into session changes the state from transient to persistent
		session.save(u1);
		session.save(u2);
		session.save(p1);
		session.save(p2);
		tr.commit();
		session.close();
		sf.close();

	}

}
