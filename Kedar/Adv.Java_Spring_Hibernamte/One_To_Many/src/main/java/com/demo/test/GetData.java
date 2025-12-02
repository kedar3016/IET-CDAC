package com.demo.test;
import com.demo.beans.*;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class GetData {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.getCurrentSession();
		Transaction tr=session.beginTransaction();
		System.out.println("before get");
		Department d1 =session.get(Department.class, 101);
		
		System.out.println("after get");
		System.out.println("-----------------------");
		System.out.println(d1);
		System.out.println("before get employee");
		Employee e1 =session.load(Employee.class, 11);
		System.out.println("after get employee");
		System.out.println(e1);
		System.out.println(e1.getDept().getDname());

	}

}
