package com.demo.test;

import com.demo.sorting.SelectionSortAlgo;

public class TestSelectionSort {

	public static void main(String[] args) {
		
		int arr[] = {5,3,8,1,4,6,2,7};
		System.out.println("Aecsending order : ");
		SelectionSortAlgo.selectionSortAsen(arr);
		
		System.out.println("Decsending order : ");
		SelectionSortAlgo.selectionSortDsen(arr);
		
		

	}

}
