package com.demo.Test;

import java.util.Scanner;

import com.demo.Arrays.ArrayServices;

public class TestArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayServices aservice = new ArrayServices();
		String arr[] = new String[7];
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" word :");
			arr[i] = sc.next();
		}
		
		System.out.println("Array :");
		aservice.sort(arr);
		aservice.display(arr);

	}

}
