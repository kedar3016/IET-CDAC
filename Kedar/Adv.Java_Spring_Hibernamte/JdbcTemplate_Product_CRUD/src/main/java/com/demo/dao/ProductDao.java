package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean save(Product p);

	List<Product> showAll();

	List<Product> showByCid(int cid);

	boolean removeByPid(int pid);

	boolean modifiedByPid(int pid, int qty, double price);

	List<Product> sortByPrice();

}
