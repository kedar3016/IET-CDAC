package com.demo.sorting;

import java.util.Arrays;

public class SelectionSortAlgo {
	
	public static void selectionSortAsen(int arr[]) {
		for(int i = 0;i<arr.length;i++) {
			
			int maxPos = findMax(arr,i);
			
			swap(arr,i,maxPos);
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void selectionSortDsen(int arr[]) {
		for(int i = 0;i<arr.length;i++) {
			
			int minPos = findMin(arr,i);
			
			swap(arr,i,minPos);
		}
		System.out.println(Arrays.toString(arr));
	}
	private static int findMin(int[] arr, int start) {
		int minPos = start;
		int min = arr[minPos];
		for(int i =start ; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
				minPos = i;
				
			}
		}
		return minPos;
	}
	private static int findMax(int[] arr, int start) {
		
		int maxPos = start;
		int max = arr[maxPos];
		for(int i =start ; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				maxPos = i;
				
			}
		}
		return maxPos;
	}

	private static void swap(int[] arr, int i, int maxPos) {
			
//			arr[i] = arr[i]+arr[maxPos];//3
//			arr[maxPos] = arr[i] - arr[maxPos];//b = 1
//			arr[i] = arr[i] - arr[maxPos];// 2
		
		int temp = arr[i];
		arr[i] = arr[maxPos];
		arr[maxPos] = temp;
	}
	
}
