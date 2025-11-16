package com.demo.sort;

import java.util.Arrays;

public class MergeSort {
	public static void MergeSortAlgo(int arr[],int start,int end) {
		
		if(start<end) {
			
			int mid = (start+end)/2;
			
			MergeSortAlgo(arr,start,mid);
			
			MergeSortAlgo(arr,mid+1,end);
			
			merge(arr,start,mid,end);
			
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int n1 = mid - start +1;
		
		int leftArray[] = new int[n1];
		
		int n2 = end - mid;
		
		int rightArray[] = new int[n2];
		
		
		for(int i = 0;i<n1;i++) {
			leftArray[i] = arr[start+i];
		}
		for(int i = 0;i<n2;i++) {
			rightArray[i] = arr[mid+1+i];
		}
		int i= 0;
		int j = 0;
		int k = start;
		
		while(i < n1 && j<n2) {
			if(leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
				k++;
			}
			else {
				arr[k] = rightArray[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while(j <n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
		System.out.println(start+","+mid+","+end);
		System.out.println(Arrays.toString(leftArray));
		System.out.println(Arrays.toString(rightArray));
		
		
	}

}
