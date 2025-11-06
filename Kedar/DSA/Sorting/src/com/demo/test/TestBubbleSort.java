package com.demo.test;

import com.demo.sorting.BubbleSort;

public class TestBubbleSort {

	public static void main(String[] args) {

		int arr[] = {21,2,5,1,7,8,10,3};
	
		BubbleSort.bubblesort(arr);
		System.out.println("Sorted Array:  ");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		BubbleSort.mBubblesort(arr);
		System.out.println("\nModified Sorted Array:  ");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}


	}

}
