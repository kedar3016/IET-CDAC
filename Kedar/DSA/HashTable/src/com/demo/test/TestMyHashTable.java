package com.demo.test;

import com.demo.hashtable.MyHashTable;
import java.util.*;

public class TestMyHashTable {
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		int ch;
		MyHashTable ht = new MyHashTable(4);
		
		ht.insertData(45);
		ht.insertData(40);
		ht.insertData(42);
		ht.insertData(12);
		ht.insertData(8);
		ht.insertData(7);
		
		
		ht.display();
		
		System.out.println("After delete : ");
//		ht.deleteData(40);
		ht.deleteData(12);
		ht.display();
		
		do {
			System.out.println("1:Accept data \n2:Display \n3:Delete Data \n4:Exit");
			System.out.println("\nEnter the Choice: ");
			ch = sc.nextInt();
			
			switch(ch) {
				
			}
		}while(ch != 4);
	}

}
