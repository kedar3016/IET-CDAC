package com.demo.test;

import com.demo.sort.SortAlgo;

public class testSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]\
		
		int arr[] = {12,45,2,48,1,85,65};
		SortAlgo sort = new SortAlgo();
//		sort.insertionSort(arr);
//		sort.bubbleSort(arr);
		sort.selectionSort(arr);
		

	}

}
