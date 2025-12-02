package com.demo.test;
import com.demo.beans.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetData {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		System.out.println("before get");
		Project p1=session.get(Project.class, 1);
		System.out.println("after get");	
		System.out.println(p1);
		
		System.out.println("before get employee");
		Employee e1=session.get(Employee.class, 11);
		System.out.println("after get employee");	
		System.out.println(e1);
		System.out.println(e1.getPset());
		tr.commit();
		session.close();
		sf.close();

	}

}
