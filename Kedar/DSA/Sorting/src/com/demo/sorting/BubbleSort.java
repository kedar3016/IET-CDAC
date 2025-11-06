package com.demo.sorting;

public class BubbleSort {

	public static void bubblesort(int[] arr) {
		int  n= arr.length;
		for(int i = 0;i<n;i++) {
			for(int j = 1;j<n-i;j++) {
				if(arr[j-1] > arr[j]) {
					swap(arr,j-1,j);
				}
			}
			
		}
		
	}
	

	private static void swap(int arr[] ,int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}


	public static void mBubblesort(int[] arr) {
		int n  = arr.length;
		boolean flag = false;
		for(int i = 0;i<n;i++) {
			for(int j = 1;j<n-i;j++) {
				if(arr[j-1]>arr[j]) {
					flag = true;
					swap(arr,j-1,j);
				}
			}
			if(!flag) {
				break;
			}
		}
		
		
	}

}
