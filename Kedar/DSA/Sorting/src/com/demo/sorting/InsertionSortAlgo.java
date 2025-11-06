package com.demo.sorting;

import java.util.Arrays;

public class InsertionSortAlgo {
	
	public static void insertionSort(int arr[]){
		System.out.println("Original Array : "+Arrays.toString(arr));
		for(int i = 1;i<arr.length;i++) {
			int j = i - 1;
			int key = arr[i];
			
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				System.out.println(j+1+" <----- swapped position -----> "+j);
//				System.out.println(arr[j+1]+" <----- swapped  -----> "+arr[j]);
				j--;
			}
			System.out.println(arr[j+1]+" <----- swapped  -----> "+key);
			arr[j+1] = key;
			System.out.println(Arrays.toString(arr));
			
		}
	}

}
