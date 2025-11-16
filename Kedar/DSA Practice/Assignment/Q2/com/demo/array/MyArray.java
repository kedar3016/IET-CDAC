package com.demo.array;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Enter the size : ");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0;i<n;i++) {
			System.out.println("Enter "+ (i+1) + "Element : ");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		int brr[] = additionElement(arr);
		
		System.out.println(Arrays.toString(brr));
		
		
	}

	private static int[] additionElement(int[] arr) {
		int brr[] = new int[arr.length];
			int sum;
			for(int i = 0;i<arr.length;i++) {
				sum = 0;
				for(int j = 0;j<arr.length;j++) {
					if(i != j) {
						sum = sum + arr[j];
					}
					
				}
				brr[i] = sum;
				
			}
			return brr;
	}

}
