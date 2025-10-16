package com.demo.Test;

import com.demo.bean.Employee;

import java.io.*;
import java.util.*;

public class TestSerialization {

	public static void main(String[] args) {
		List<Employee> lst=new ArrayList<>();
		lst.add(new Employee(11,"Ashutosh","AI",56789));
		lst.add(new Employee(12,"Pranav","Manager",55444));
		lst.add(new Employee(23,"Shreyasi","asistant",6665));
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("EmpData1.txt"));){
			
			for(Employee e :lst) {
				oos.writeObject(e);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
