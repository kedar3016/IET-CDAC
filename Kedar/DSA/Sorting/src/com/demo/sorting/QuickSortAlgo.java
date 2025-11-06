package com.demo.sorting;

import java.util.Arrays;

public class QuickSortAlgo {

	public static void quickSort(int[] arr, int start, int end) {
		if(start<end) {
			int p = partition(arr,start,end);
			quickSort(arr,start,p-1);
			quickSort(arr,p+1,end);
			
		}
		
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = start;
		int i = start;
		int j = end;
		
		while(i<j) {
			while(i<end && arr[i]<=arr[pivot]) {
				i++;
			}
			while(j>start && arr[j]>arr[pivot]) {
				j--;
			}
			if(i<j) {
				swap(arr,i,j);
				i++;
				j--;
			}
		}
		
		if(j!= pivot) {
			swap(arr,j,pivot);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Pivot Position : "+j+"  Pivot Value : "+arr[pivot]);
		System.out.println(arr[j] + " <----- Swapped With -----> "+arr[pivot]);
		return j;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
