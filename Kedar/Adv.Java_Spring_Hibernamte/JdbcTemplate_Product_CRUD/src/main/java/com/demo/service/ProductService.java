package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	List<Product> displayAll();

	List<Product> FindByCid(int cid);

	boolean deleteByPid(int pid);

	boolean updateByPid(int pid, int qty, double price);

	List<Product> sortByPrice();

}
