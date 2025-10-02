package com.arrays;
import java.util.*;

public class ArrayOpreation {

	public static void acceptArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the "+arr.length+" Elements:= ");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
	}

	public static void displayArray(int[] arr) {
		System.out.println("Array Elements:= ");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void displayOcur(int[] arr) {
		System.out.println("Array Elements Indexs := ");
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>-1)
			System.out.print(arr[i]+" ");
		}
		
	}

	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
		
	}

	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]<min && arr[i]>-1) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int AddData(int[] arr) {
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int[] dupliOccur(int num, int[] arr) {
		int n = arr.length;
		int temp[]=new int[n];
		for(int i = 0;i<n;i++) {
			temp[i] =-1;
		}
		int cnt =0;
		for(int i = 0;i<n;i++) {
			if(arr[i] == num) {
				temp[cnt] = i+1;
				cnt++;
				
			}
		}
		
		if(cnt>0) {
			return temp;
		}
		else {
			return null;
		}
		
	}

	public static void nthMax(int k, int[] arr) {
		
		        
		        int n = arr.length;
		       

		        Arrays.sort(arr);

		        if(k<=n){
		            int nthlargest =arr[n-k];
		            System.out.println(k+ " largest number is :" + nthlargest); 
		        }
		        else{
		            System.out.println("n is larger than array size");
		        }
		        
		    }

	public static int[] primeNum(int[] arr) {
		int temp[] = new int[arr.length];
		int cnt =0;
		for(int i=0;i<arr.length;i++) {
			temp[i] = -1;
		}
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				temp[cnt++] = arr[i];
			}
				
			
		}
		if(cnt>0) {
		return temp;
		}
		else {
			return null;
		}
	}

	private static boolean isPrime(int n) {
		if(n == 1 || n == 2) {
			return true;
		}
		else {
			for(int i = 2;i<n;i++) {
				if(n%i == 0) {
					return false;
				}
			}
		}
		return true;
	}
		
		
	}


