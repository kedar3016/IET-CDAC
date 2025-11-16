package com.demo.Arrays;

public class ArrayServices {
	public void display(String arr[]) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void sort(String []arr) {
		int i = 0;
		
		
		while(i<arr.length) {
			
			int j = i+1;
			while(j < arr.length) {
				if(arr[i].charAt(1) == arr[j].charAt(1)) {
					swap(arr,i+1,j);
					
					
					
					}
				j++;
			}
			i++;
		}
	}

	private void swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
}
