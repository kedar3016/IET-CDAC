package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Order;

public class TestLifeCycleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Order o1 = (Order)ctx.getBean("ord1");
		
		System.out.println(o1);

	}

}
