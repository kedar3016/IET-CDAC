package com.demo.test;
import java.util.*;

import com.demo.Stack.MyStackList;

public class TestMyStackList {

	public static void main(String[] args) {

		MyStackList stackL = new MyStackList();
		
		Scanner sc = new Scanner(System.in);
		int ch;
		
		do {
			System.out.println("1: push Element\n2: pop Element\n3: Display\n4: Exit");
			System.out.println("Enter Your Choice : ");
			ch = sc.nextInt();
			switch(ch) {
			
				case 1 ->{
							System.out.println("Enter the Value : ");
							int val = sc.nextInt();
							stackL.push(val);
				}
				case 2 ->{
					int data = stackL.pop();
					if(data != -1) {
							System.out.println(stackL.pop()+" Element Pop Successfully!!!\n\n");
					}
				
					}
				case 3 ->{
							stackL.display();
				}
				case 4->{
							System.out.println("Thank You for visting!!!");
							sc.close();
				}
			}
		
		}while(ch != 4);


	}

}
