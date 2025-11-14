package com.demo.Arrays;

import java.util.*;

public class MyArrayService
{
	
		public int[] acceptArray(int arr[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Elements of the Array : ");
			for(int i = 0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
				
			}
			return arr;
			
		}
		
		public String[] acceptStrArray(String arr[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Elements of the Array : ");
			for(int i = 0;i<arr.length;i++) {
				arr[i] = sc.next();
				
			}
			return arr;
			
		}
		
		public void displayArray(int arr[]){
			System.out.print("Array : - ");
			
			for(int i = 0;i<arr.length;i++) {
				System.out.print(arr[i]+",");
				
			}	
		}
		
		public void displayArray(String arr[]){
			System.out.print("Array : - ");
			
			for(int i = 0;i<arr.length;i++) {
				System.out.print(arr[i]+",");
				
			}	
		}
		
		public int sumOfDigit(int n) {
			
			int sum = 0;
			while(n != 0) {
				int temp = n % 10;
				sum +=  temp;
				n = n / 10;
				
			}
			return sum;
		}

		public int[] sumOfDigitArray(int[] arr) {
				int sum[] = new int[arr.length];
			for(int i = 0;i<arr.length;i++) {
				sum[i] = sumOfDigit(arr[i]);
			}
			return sum;
		}

		public int findPrimeCount(int[] arr) {
			// TODO Auto-generated method stub
			int cnt =0;
			for(int i = 0 ;i<arr.length;i++) {
				if(isPrime(arr[i])) {
					cnt++;
				}
			}
			return cnt;
		}

		private boolean isPrime(int num) {

			if (num < 2) return false;
			
			
	        for (int i = 2; i  < num; i++) {
	            if (num % i == 0) 
	            	return false;
	        }
	        return true;
		}
		
		

		public Map<Integer, Integer> primefact(int[] arr) {
			Map <Integer,Integer> res = new HashMap<>();
			for(int i = 0;i<arr.length;i++) {
				 if(isPrime(arr[i])) {
					 int f = fact(arr[i]);
					 res.put(arr[i], f);
				 }
			}
			return res;
		}

		private int fact(int n) {
			int f = 1;
			for(int i = n;i>0;i--) {
				f = f*i;
			}
			return f;
		}

		public int findMaxPrime(int[] arr) {
			int max = 0;
			for(int i = 0;i<arr.length;i++) {
				if(isPrime(arr[i])) {
					
					if(arr[i]>max) {
						max = arr[i];
					}
				}
			}
			return max;
		}

		public int[] copyArray(int[] arr) {
			int res[]= new int[arr.length];
			
			for(int i = 0;i<arr.length;i++) {
				if(isPrime(arr[i]) && arr[i]>5) {
					int rev = reverseNum(arr[i]);
					res[i] = rev;
					
				}
				else {
					res[i] = arr[i];
					
					
				}
			}
			return res;
		}

		private int reverseNum(int n) {
			
			if(n<10) {
				return n;
			}
			else {
				int rev = 0;
				while(n != 0) {
					int temp = n % 10;
					rev  = temp+rev*10;
					n = n / 10;
					
				}
				return rev;
			}
			
		}

		public void sortString(String[] str) {

			int i = 0;
			
			while(i < str.length) {
				int j = i+1;
				
				while(j < str.length) {
				if(str[i].charAt(1)== str[j].charAt(1)) {
					
					swap(str,i+1,j);
			
					}
					j++;
				}
				i++;
			}
			
		}

		private void swap(String[] str, int i, int j) {

			String temp = str[i];
			str[i]  = str[j];
			str[j]  = temp;
			
		}
		
}

	
	
	

