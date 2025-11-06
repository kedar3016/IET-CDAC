package com.demo.Arrays;
import com.demo.Arrays.*;
import java.util.*;

public class My2DArray {
	
	int [][] arr;
	
	public My2DArray(){
		arr = new int[3][3];
	}
	
	public My2DArray(int row,int col) {
		arr = new int[row][col];
	}
	
	public boolean acceptData() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				System.out.println("Enter the Elements Value : "+i+" , "+j);
				arr[i][j] = sc.nextInt();				
			}
		}
		return true;
	}

	public void displayData() {
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
								
			}
			System.out.println();
		}
		
		
	}
	
	public void displayMatrix(int[][] a) {
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
								
			}
			System.out.println();
		}
		
		
	}

	public int[][] addition(My2DArray ob2) {
		int crr[][] = new int[this.arr.length][this.arr[0].length];
	
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				crr[i][j] = this.arr[i][j] + ob2.arr[i][j];
								
			}
		
	}
		return crr;
	}

	public int[][] substration(My2DArray ob2) {
		int crr[][] = new int[this.arr.length][this.arr[0].length];
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				crr[i][j] = this.arr[i][j] - ob2.arr[i][j];
								
			}
		
	}
		return crr;
	}

	public int[][] tranpose() {
		int trr[][] = new int[arr.length][arr[0].length];
				
				for(int i = 0;i<arr.length;i++) {
					for(int j = 0;j<arr.length;j++) {
						trr[i][j] = arr[j][i];
										
					}

	}
				return trr;

	}

	public int[] sumRowWise() {
		int a[] = new  int[arr.length];
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
					a[i] += arr[i][j];
								
			}
		
	}
		return a;
	}

	public int[] sumColWise() {
		int a[] = new  int[arr.length];
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
					a[i] += arr[j][i];
								
			}
		
	}
		return a;
	}
}