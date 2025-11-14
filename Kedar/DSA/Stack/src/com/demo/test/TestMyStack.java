package com.demo.test;

import java.util.Scanner;
import com.demo.Stack.MyStackArray;

public class TestMyStack {

	public static void main(String[] args) {
		MyStackArray stack = new MyStackArray();
			
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
								stack.push(val);
					}
					case 2 ->{
						int data = stack.pop();
						if(data != -1)
								System.out.println(stack.pop()+" Element Pop Successfully!!!\n\n");
								
					}
					case 3 ->{
								stack.display();
					}
					case 4->{
								System.out.println("Thank You for visting!!!");
								sc.close();
					}
				}
			
			}while(ch != 4);

	}

}
