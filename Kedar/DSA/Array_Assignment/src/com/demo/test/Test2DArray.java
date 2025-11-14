package com.demo.test;

import com.demo.Arrays.My2DArray;

public class Test2DArray {

	public static void main(String[] args) {
		My2DArray ob = new My2DArray();
//		int arr[][] = {{1,2,3,4},{4,5,73,7},{7,8,9,10},{7,4,69,10}};
		
		int arr[][] = {{1,2,3},{3,1,4},{2,0,5}};
		
		ob.display(arr);
		
		System.out.println("Reverse :");
		
		int rev[][]= ob.reverseArray(arr);
		ob.display(rev);
		
		System.out.println("Max Odd : ");
		int max[] = ob.maxOdd(arr);
		
		for(int i = 0;i<max.length;i++) {
			System.out.println((i+1)+" ----> "+max[i]);
		}
		int row = ob.rowAvg(arr);
		int col = ob.colAvg(arr);
		System.out.println("Average : "+(row+col));
		
		
		

	}

}
