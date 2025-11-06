package com.demo.test;

import java.util.Scanner;

public class TestFact {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No . :  ");
		int n = sc.nextInt();
		
		int f = fact(n);
		System.out.println("factorial is = "+f);

	}

	private static int fact(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n * fact(n-1);
		}
	}

}
