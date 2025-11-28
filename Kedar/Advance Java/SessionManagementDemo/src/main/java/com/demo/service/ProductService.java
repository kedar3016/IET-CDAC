package com.demo.service;

import java.util.List;

import com.demo.bean.Product;

public interface ProductService {

	List<Integer> getAllCategory();

	List<Product> getByCid(int cid);

}
