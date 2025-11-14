package com.demo.test;
import java.util.*;
import com.demo.Arrays.MyArrayService;

public class Test1DArray {

	public static void main(String[] args) {
		
	
		MyArrayService service = new MyArrayService();
		Scanner sc = new Scanner(System.in);
		int ch;
		
		System.out.println("Enter the Size of the Array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];

		
		
		do {
			System.out.println("\n--------------------------------Menu----------------------------");
			System.out.println("\n1:Sum of Digit\n2:Factorial of Prime No\n3:Max Prime No\n4:Copy Array"
					+ "\n5:String Array\n6:Exit");
			System.out.println("------------------------------------------------------------");
			System.out.println("\nEnter Your Choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1->{
					arr = service.acceptArray(arr);
					System.out.println("Original Array : ");
					service.displayArray(arr);
					int brr[] = service.sumOfDigitArray(arr);
					System.out.println("Original Array : ");
					service.displayArray(arr);
					System.out.println("\nSum Of Digit Array : ");
					service.displayArray(brr);
					System.out.println("\n======================================");
			}
			case 2->{
					arr = service.acceptArray(arr);
					System.out.println("Original Array : ");
					service.displayArray(arr);
					Map<Integer, Integer>pfact = service.primefact(arr);
					System.out.println(pfact);
					System.out.println("\n=====================================\n");
			}
			case 3->{
				arr = service.acceptArray(arr);
				System.out.println("Original Array : ");
				service.displayArray(arr);
				int maxPrime = service.findMaxPrime(arr);
				System.out.println("Max Prime No is : "+maxPrime);
				System.out.println("==========================================\n");
				
			}
			
			case 4 ->{
				int [] brr = service.copyArray(arr);
				System.out.println("Copy Array : ");
				service.displayArray(brr);
			}
			case 5 ->{
				String str[] = new String[5];
				service.acceptStrArray(str);
				service.sortString(str);
				service.displayArray(str);
			}
			
			}
			
		}while(ch != 6);

	}

}
