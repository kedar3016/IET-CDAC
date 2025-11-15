package com.demo.services;
import com.demo.dao.*;

public class EmployeeServiceImpl1 implements EmployeeService1{
	EmployeeDao1 edao = new EmployeeDaoImpl1();
	@Override
	public void quickSort() {
		edao.qSort();
		
	}
	@Override
	public void display() {
		edao.showAll();
		
	}

}
