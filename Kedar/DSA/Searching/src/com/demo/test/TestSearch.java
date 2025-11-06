package com.demo.test;
import java.util.*;
import com.demo.service.*;
public class TestSearch {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		SearchingService aservice = new SearchingService();
		System.out.println("Enter the Size of the array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Array Element in Sorted Order : ");
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int ch;
		
		do {
			System.out.println("1:Display Array"
					+ "\n2:Sequential Search \n3 : Binary Search "
					+ "\n4 : Recursuve Binary Serch"
					+ "\n5: Exit");
			System.out.println("Enter your Choice : ");
			ch = sc.nextInt();
			switch(ch) {
			
			case 1->{
				aservice.dislay(arr);
					
			}
			case 2->{
				System.out.println("Enter No. want Search : ");
				int key = sc.nextInt();
				int pos = aservice.sequentialSearch(arr,key);
				if(pos != -1) {
					System.out.println(key+ " Found at location "+pos);
				}
				else {
					System.out.println("No Not Found!!!");
				}
			}
			case 3->{
				System.out.println("Enter No. want to Search : ");
				int key = sc.nextInt();
				int pos = aservice.binarySearch(arr,key);
				if(pos != -1) {
					System.out.println(key+ " Found at location "+pos);
				}
				else {
					System.out.println("No. Not Found!!!");
				}
			}
			
			case 4 ->{
				System.out.println("Enter No. want to Search : ");
				int key = sc.nextInt();
				int pos = aservice.binaryRecurSearch(arr,key,0,arr.length);
				if(pos != -1) {
					System.out.println(key+ " Found at location "+pos);
				}
				else {
					System.out.println("No. Not Found!!!");
				}
			}
			
			
			case 5 ->{
				System.out.println("Thank for Visiting!!!!");
			}
			}
		}while(ch!= 5);
	}

}
