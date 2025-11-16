package com.demo.sort;

import java.util.Arrays;

public class SortAlgo {
	
	public void insertionSort(int arr[]) {
		for(int  i= 1;i<arr.length;i++) {
			int j = i-1;
			int key = arr[i];
			int cnt = 1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
				cnt++;
			}
			arr[j+1] = key;
			System.out.println("Iteration "+i+" ---> shift ----> "+cnt);
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public void bubbleSort(int arr[]) {
		System.out.println(Arrays.toString(arr));
		for(int i = 0;i<arr.length;i++) {
			
			for(int j = 1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					swap(arr,j-1,j);
					
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}

	private void swap(int[] arr, int i, int j) {
		System.out.println(arr[i] +" <--swap--> "+arr[j]);
				int temp = arr[i];
				arr[i] =arr[j];
				arr[j] = temp;
						
		
	}
	
	public void selectionSort(int arr[]) {
		for(int  i= 0;i<arr.length-1;i++) {
			
			int minPos = findMinPos(arr,i);
			
		
					swap(arr,i,minPos);
			
		
			System.out.println(Arrays.toString(arr));
			
		}
	}

	private int findMinPos(int[] arr, int start) {
		int minPos = start;
		int min = arr[start];
		for(int i = start;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
				minPos = i;
			}
		}
		return minPos;
	}
	
	public void quickSort(int arr[],int start,int end) {
		
		if(start < end) {
			int p = partition(arr,start,end);
			quickSort(arr,start,p-1);
			quickSort(arr,p+1,end);
		}
	}

	private int partition(int[] arr, int start, int end) {
		
		int pivot = start;
		int i = start;
		int j = end;
		
		while(i < j) {
			while(i<end && arr[i]<=arr[pivot]) {
				i++;
			}
			while(j>start && arr[j]>= arr[pivot]) {
				j--;
			}
			
			if(i < j) {
				swap(arr,i,j);
			}
			if(pivot != j) {
				swap(arr,j,pivot);
			}
		}
		System.out.println(Arrays.toString(arr));
		return j;
		
	}

}
