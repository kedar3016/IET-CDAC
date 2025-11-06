package com.demo.service;

public class SearchingService {
	

	public void dislay(int[] arr) { 
		System.out.println("Array Is : ");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public int sequentialSearch(int[] arr, int key) {
		
		for(int i = 0;i<arr.length;i++) {
			if(key == arr[i]) {
				return i+1;
			}
		}
		return -1;
	}

	public int binarySearch(int[] arr, int key) {

		int low = 0;
		int high = arr.length-1;
		int cnt = 0;
		while(low <= high) {
			int mid = (high+low)/2;
			cnt++;
			if(arr[mid] == key) {
				return mid+1;
			}
			else if(arr[mid]>key) {
				low = mid+1;
			}
			else {
				high = mid - 1;
			}
			
		}
		
		
		return -1;
	}



	public int binaryRecurSearch(int[] arr, int key, int low , int high) {
		if(low <= high) {
			int mid = (high + low)/2;
			
			if(arr[mid] == key) {
				return mid;
			}
			else if(key<arr[mid]) {
				return binaryRecurSearch(arr,key,low,mid);
			}
			else {
				return binaryRecurSearch(arr,key,mid + 1,high);
			}
		}
		
		return -1;
	}
	
	

}
