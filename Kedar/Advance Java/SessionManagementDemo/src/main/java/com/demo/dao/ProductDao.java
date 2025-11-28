package com.demo.dao;

import java.util.List;

import com.demo.bean.Product;

public interface ProductDao {

	List<Integer> findAllCategory();

	List<Product> findByCid(int cid);

}
