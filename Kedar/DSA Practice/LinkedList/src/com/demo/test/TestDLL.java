package com.demo.test;

import java.util.Scanner;

import com.demo.list.DLL;

public class TestDLL {
	public static void main(String [] arg) { 
	Scanner sc = new Scanner(System.in);
	
	DLL dlist = new DLL();
	
	int ch;
	
			do {
					System.out.println("------------------ DLL Menu --------------------"
							+ "\n0 : Exit\n1 : Add New Node At End\n2 : Display Data"
							+ "\n3 : Display Reverse\n4 : Reverse List\n5 : Add Before Value"
							+ "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("\nEnter your choice : ");
					ch = sc.nextInt();
					switch(ch) {
							
							case 1 ->{
								System.out.println("Enter the Value : ");
								int val = sc.nextInt();
								dlist.addNode(val);
								
							}
							case 2 ->{
								dlist.display();
							}
							case 3 ->{
								dlist.displayRev();
							}
							case 4 ->{
								System.out.println("Remaining Work!!!");
							}
							case 5 ->{
								System.out.println("Enter num : ");
								int num = sc.nextInt();
								System.out.println("Enter the Value: ");
								int val = sc.nextInt();
								dlist.addBeforeVal(num,val);
							}
					}
			}while(ch != 0);

	}
}
