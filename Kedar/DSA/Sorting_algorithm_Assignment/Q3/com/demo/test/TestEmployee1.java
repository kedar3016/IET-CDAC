package com.demo.test;
import com.demo.services.*;
public class TestEmployee1 {

	public static void main(String[] args) {

		EmployeeService1 emp = new EmployeeServiceImpl1();
		
		emp.quickSort();
		emp.display();

	}

}
