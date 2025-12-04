package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao pdao;
	
	@Override
	public boolean addNewProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product id : ");
		int pid = sc.nextInt();
		System.out.println("Enter the Product name : ");
		String pname = sc.next();
		System.out.println("Enter the Quntity : ");
		int qty = sc.nextInt();
		System.out.println("Enter the Price : ");
		double price = sc.nextDouble();
		System.out.println("Enter the project MfgDate (DD/MM/YYYY) : ");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Enter the Category id : ");
		int cid = sc.nextInt();
		
		Product p = new Product(pid,pname,qty,price,ldt,cid);
		
		return pdao.save(p);
	}

	@Override
	public List<Product> displayAll() {
		// TODO Auto-generated method stub
		return pdao.showAll();
	}

	@Override
	public List<Product> FindByCid(int cid) {
		// TODO Auto-generated method stub
		return pdao.showByCid(cid);
	}

	@Override
	public boolean deleteByPid(int pid) {
		// TODO Auto-generated method stub
		return pdao.removeByPid(pid);
	}

	@Override
	public boolean updateByPid(int pid, int qty, double price) {
		// TODO Auto-generated method stub
		return pdao.modifiedByPid(pid,qty,price);
	}

	@Override
	public List<Product> sortByPrice() {
		// TODO Auto-generated method stub
		return pdao.sortByPrice();
	}

}
