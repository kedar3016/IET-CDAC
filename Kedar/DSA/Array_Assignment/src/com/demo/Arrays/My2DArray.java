package com.demo.Arrays;

public class My2DArray {
	
	public void display(int arr[][]) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public int[][] reverseArray(int arr[][]){
		int rev[][] = new int[arr[0].length][arr[0].length];
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				rev[i][(arr[i].length-1)-j] = arr[i][j]; 
			}
		}
		return rev;
	}
	
	public int[] maxOdd(int arr[][]) {
		
		int max[] = new int[arr.length];
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				if(arr[i][j] % 2 != 0 && arr[i][j]>max[i]) {
					max[i] = arr[i][j];
				}
				
			}
		}
		return max;
	}
	
	public int rowAvg(int arr[][]) {
//		int avg[] = new int[arr[0].length];
		int n = arr.length;
		int avg = 0;
		int sum =0;
		int i;
		for( i = 0;i<n;i++) {
			sum = 0;
			for(int j = 0;j<arr[i].length;j++) {
				sum += arr[i][j];
			}
			avg += sum/arr[i].length;
			
		}

		return avg/i;
		
	}

	public int colAvg(int[][] arr) {
		int n = arr.length;
		int avg=0,sum =0;
		int i;
		for( i = 0;i<n;i++) {
			sum = 0;
			for(int j = 0;j<arr[i].length;j++) {
				sum += arr[j][i];
			}
			avg += sum/arr.length;
			
			System.out.println();
			
		}

		return avg/i;
		
	}

}
