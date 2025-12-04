package com.demo.beans;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Order implements BeanNameAware,BeanFactoryAware,DisposableBean,InitializingBean{
	private int ordid;
	private String cname;
	private List<Products> plist;
	private double ordamount;
	public Order() {
		super();
	}
	public Order(int ordid, String cname, List<Products> plist,double ordamount) {
		super();
		this.ordid = ordid;
		this.cname = cname;
		this.plist = plist;
		this.ordamount = ordamount;
	}
	public int getOrdid() {
		return ordid;
	}
	public void setOrdid(int ordid) {
		this.ordid = ordid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Products> getPlist() {
		return plist;
	}
	public void setPlist(List<Products> plist) {
		this.plist = plist;
	}
	@Override
	public String toString() {
		return "Order [ordid=" + ordid + ", cname=" + cname + ", plist=" + plist + "]";
	}
	public void setBeanName(String name) {
		System.out.println("In Bean Name Aware");
		
	}
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("in setBeanFactory of BeanFactoryAware");
		
	}
	public void destroy() throws Exception {
		System.out.println("in destroy of DisposableBean");
		
	}
	public void afterPropertiesSet() throws Exception {
		plist.forEach(System.out::println);
		
		//convert productlist to List of Double to save amount for each product
		List<Double> amtlist=plist.stream().map(product->product.getQty()*product.getPrice())
				.collect(Collectors.toList());
		//calculate total amount
		this.ordamount=amtlist.stream().reduce(0.0,(acc,amt)->acc+amt);
		System.out.println("in afterPropertiesSet of InitializingBean");
	
		
	}
	public double getOrdamount() {
		return ordamount;
	}
	public void setOrdamount(double ordamount) {
		this.ordamount = ordamount;
	}
	
}
