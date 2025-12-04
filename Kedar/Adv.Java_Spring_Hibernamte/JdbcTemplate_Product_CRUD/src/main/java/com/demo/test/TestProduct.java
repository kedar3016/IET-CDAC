package com.demo.test;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;
import com.demo.service.ProductService;

public class TestProduct {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		
		ProductService pservice = (ProductService)ctx.getBean("productServiceImpl");

		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("-----------Menu-----------");
			System.out.println("\n0 : Exit\n"
					+ "1 : Add new Product\n"
					+ "2 : Display All\n"
					+ "3 : Display All By Category\n"
					+ "4 : Delete By Id\n"
					+ "5 : Modify By Id\n"
					+ "6 : Arrange in Sorted Order\n"
					+ "===============================");
			System.out.println("\nEnter Your Choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
			
				case 1 ->{System.out.println("-------Enter the Products Details-------");
						boolean status = pservice.addNewProduct();
						if(status) {
							System.out.println("Product Added Succesfully!!");
						}
						else {
							System.out.println("Try agian!!1");
						}
					
				}
				
				
				case 2 ->{
						System.out.println("----------Products----------");
						List<Product> plist = pservice.displayAll();
						plist.forEach(System.out::println);
				}
				
				case 3 ->{
						System.out.println("-----------Find By Category-------");
						System.out.println("Enter the category id : ");
						int cid = sc.nextInt();
						List<Product> plist = pservice.FindByCid(cid);
						plist.forEach(System.out::println);
				}
				
				case 4 ->{
					System.out.println("-----------Delete By Pid-------");
					System.out.println("Enter the Product id : ");
					int pid = sc.nextInt();
					boolean flag = pservice.deleteByPid(pid);
					if(flag) {
						System.out.println("Deleted Successfully!!");
					}
					else {
						System.out.println("Not Found!!");
					}
					
				}
				
				case 5 ->{
					System.out.println("Enter the Product id : ");
					int pid = sc.nextInt();
					System.out.println("Enter the  qty : ");
					int qty = sc.nextInt();
					System.out.println("Enter the Price : ");
					double price = sc.nextDouble();
					boolean flag = pservice.updateByPid(pid,qty,price);
					if(flag) {
						System.out.println("Updated Successfully!!");
					}
					else {
						System.out.println("Not Found!!");
					}
					
					
				}
				
				case 6 ->{
					System.out.println("----------Products sort by price----------");
					List<Product> plist = pservice.sortByPrice();
					plist.forEach(System.out::println);
				}
			}
			
		}while(ch != 0);

	}

}
