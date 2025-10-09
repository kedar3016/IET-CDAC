package com.demo.string;

public class StringOpreation {

	public static void main(String[] args) {

		String str = "hello";
		String str1 = "WORLD";
		System.out.println(str.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		System.out.println(str.concat(str1));
		
		System.out.println(str.startsWith(str1));

		System.out.println(str.toString());
	}

}
