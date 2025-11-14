package com.demo.test;

import java.util.*;
import com.demo.service.*;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EmployeeService emp = new EmployeeServiceImpl();
		int ch;
		
		do {
			System.out.println("\1: Bubble Sort\n2:Insert Employee Using Insertion sort"
					+ "\n3 : Accept Array of String");
			System.out.println("Enter Your Choice : ");
			ch  = sc.nextInt();
			
			switch(ch) {
				
			case 1 ->{
				System.out.println("Bubble Sort : ");
				emp.bubbleSort();
				
			}
			}
			
		}while(ch != 5);
		
		
		
		emp.display();
		
		boolean flag = emp.insert();
		if(flag) {
			System.out.println("Emp Added SuccesFully!!");
		}
		else {
			System.out.println("Error !!!");
		}
		emp.display();
		

	}

}
