package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	ProductDao pdao;
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return pdao.findAllProducts();
	}

	@Override
	public boolean addproduct(Product p) {
		// TODO Auto-generated method stub
		return pdao.save(p);
	}

	@Override
	public boolean deleteById(int pid) {
		// TODO Auto-generated method stub
		return pdao.removeById(pid);
	}

	@Override
	public Product getByPid(int pid) {
		// TODO Auto-generated method stub
		return pdao.findByPid(pid);
	}

	@Override
	public boolean updateproduct(Product p) {
		// TODO Auto-generated method stub
		return pdao.modifyProduct(p);
	}

}
