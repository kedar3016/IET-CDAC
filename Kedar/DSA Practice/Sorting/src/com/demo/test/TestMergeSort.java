package com.demo.test;

import java.util.Arrays;

import com.demo.sort.MergeSort;

public class TestMergeSort {

	public static void main(String[] args) {
		
		int arr[] = {10,50,2,30,70,42};
		
		MergeSort.MergeSortAlgo(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));

	}

}
