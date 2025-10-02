package com.arrays;

import java.util.*;
public class TestArray {

	public static void main(String[] args) {

		int n,ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : = ");
		n = sc.nextInt();
		int arr[] = new int[n];
		
		do {
			System.out.println("\n1:AcceptArray\n2:DisplayArray\n3:MaxElement\n4:MinElement"
					+ "\n5:AddElements\n6:Duplicate Occurance\n7:Nth Largest\n8:Prime Number\n9:MaxPrime\n10:MinPrime\n0:Exit");
			System.out.println("Enter your choice := ");
			ch =  sc.nextInt();
			switch(ch) {
			
			case 1:ArrayOpreation.acceptArray(arr);
					break;
			
			case 2:ArrayOpreation.displayArray(arr);
					break;
					
			case 3:System.out.println("The Maximum Element is := " + ArrayOpreation.findMax(arr));  
					break;
			
			case 4:System.out.println("The Minimum Element is := " + ArrayOpreation.findMin(arr));
					break;
					
			case 5:System.out.println("Addition of All array element is := "+ArrayOpreation.AddData(arr));
					break;
					
			case 6:System.out.println("Enter the Number := ");
					int num = sc.nextInt();
					int occur[] = new int[arr.length];
						occur = ArrayOpreation.dupliOccur(num,arr);
						ArrayOpreation.displayOcur(occur);
						break;
			case 7:System.out.println("Enter Nth Maximum number :=  ");
					int n1 = sc.nextInt();
					ArrayOpreation.nthMax(n1,arr);
					break;
			
			case 8:
					int prime[] = new int[arr.length];
					prime = ArrayOpreation.primeNum(arr);
					ArrayOpreation.displayArray(prime);
					break;
			case 9:		int primeMax[] = new int[arr.length];
						primeMax = ArrayOpreation.primeNum(arr);
						System.out.println("Maximum Prime No is: = " +ArrayOpreation.findMax(primeMax));
						break;
			case 10 :	int primeMin[] = new int[arr.length];
						primeMin = ArrayOpreation.primeNum(arr);
						System.out.println("Maximum Prime No is: = " +ArrayOpreation.findMin(primeMin));
						break;
			case 0:System.out.println("Thank You!!");
					break;
			
			}
			
			
		}while(ch != 0);

	}

}
