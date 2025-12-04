package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.MyUser;

public class TestPropertyFile {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		MyUser u = (MyUser)ctx.getBean("u1");
		System.out.println(u);

	}

}
