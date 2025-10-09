package com.demo.comparators;

import java.util.Comparator;

import com.demo.bean.Employee;

public class MyNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.geteName().compareTo(o2.geteName());
	}

}
