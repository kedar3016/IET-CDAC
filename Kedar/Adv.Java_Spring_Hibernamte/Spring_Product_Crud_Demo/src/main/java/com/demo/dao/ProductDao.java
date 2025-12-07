package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> findAllProducts();

	boolean save(Product p);

	boolean removeById(int pid);

	Product findByPid(int pid);

	boolean modifyProduct(Product p);

}
