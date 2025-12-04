package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Employee;
import com.demo.beans.HelloWorld;
import com.demo.beans.MyUser;

public class TestHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		HelloWorld hwbean = (HelloWorld) ctx.getBean("hw");
		String msg = hwbean.sayHello();
		System.out.println("Message"+msg);
		
		
		Employee e = (Employee) ctx.getBean("emp1");
		System.out.println(e);

		Employee e1 = (Employee) ctx.getBean("emp2");
		System.out.println(e1);
		
		
		MyUser u = (MyUser) ctx.getBean("u1");
		System.out.println(u);
		
		((ClassPathXmlApplicationContext)ctx).close();
		
		
		
	}

}
