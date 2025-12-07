package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	List<Product> getAllProducts();

	boolean addproduct(Product p);

	boolean deleteById(int pid);

	Product getByPid(int pid);

	boolean updateproduct(Product p);

}
