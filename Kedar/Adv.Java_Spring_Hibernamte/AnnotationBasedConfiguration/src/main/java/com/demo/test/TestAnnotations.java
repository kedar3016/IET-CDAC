package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;

public class TestAnnotations {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Product p = (Product)ctx.getBean("product");
		System.out.println(p);

	}

}
