package com.demo.StringArray;
import java.util.*;

public class ArrayService {
	String str[] = new String[6];
	
	public void insert() {
		for(int i =0 ;i<6;i++) {
		System.out.println("Enter the String "+i+" : ");
		Scanner sc = new Scanner(System.in);
		str[i] = sc.next();
		}
	}

	public void display() {
		for(int i = 0;i<6;i++) {
			System.out.print(str[i]+" ");
		}
		
	}
	
	public void mergeSort() {
		
	}
}
