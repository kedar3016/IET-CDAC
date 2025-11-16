package com.demo.test;

import java.util.Scanner;

import com.demo.queue.MyQueue;

public class TestMyQueue {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			MyQueue q = new MyQueue(5);
		
					int ch ;
				 do {
					 System.out.println("============= Menu ===============");
					 System.out.println("\n0 : Exit\n1 : add \n2 : delete"
					 		+ "\n3 :Queue Display \n4 : String Palindrome "
					 		+ "\n5 : Number Palindrome");
					 System.out.println(" ================================= ");
					 System.out.println("Enter the Choice : ");
					 ch = sc.nextInt();
					 
					 sc.nextLine();
					 
					 switch(ch) {
					 
					        case 0->{
					        	System.out.println("Good Bye!!!");
					        }
					 		
					 		case 1 ->{
					 				System.out.println("Enter the Value :");
					 				int val = sc.nextInt();
					 				q.enQueue(val);
					 				
					 		}
					 		case 2->{
					 				System.out.println(" ==> "+q.deQueue());
					 		}
					 		
					 		case 3->{
					 			q.display();
					 		}
					 
					 }
				 }while(ch != 0);
					 

	}

}
