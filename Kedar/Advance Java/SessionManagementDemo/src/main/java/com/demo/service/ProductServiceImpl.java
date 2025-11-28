package com.demo.service;

import java.util.List;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
	ProductDao pdao;
	
	
	public ProductServiceImpl() {
		super();
		pdao = new ProductDaoImpl();
	}


	@Override
	public List<Integer> getAllCategory() {
		// TODO Auto-generated method stub
		return pdao.findAllCategory();
	}


	@Override
	public List<Product> getByCid(int cid) {
		// TODO Auto-generated method stub
		return pdao.findByCid(cid);
	}

}
