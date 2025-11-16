package com.demo.test;

import java.util.Scanner;

import com.demo.stack.MyGenericStackList;

public class TestStackList {
	static MyGenericStackList<Integer> st = new MyGenericStackList<>();
	public static void main(String[] args) {
		//MyGenericStackList<Character> st = new MyGenericStackList<>();
		
		

		Scanner sc = new Scanner(System.in);
		
		int ch ;
				 do {
					 System.out.println("============= Menu ===============");
					 System.out.println("\n0 : Exit\n1 : Push \n2 : Pop"
					 		+ "\n3 : Stack Display \n4 : String Palindrome \n5 : Number Palindrome");
					 System.out.println(" ================================= ");
					 System.out.println("Enter the Choice : ");
					 ch = sc.nextInt();
					 
					 sc.nextLine();
					 
					 switch(ch) {
					 		case 0 -> {
					 				System.out.println("Good Bye !!!");
					 		}
					 		
					 		case 1 ->{
					 				System.out.println("Enter the Value : ");
					 				int val = sc.nextInt();
					 				st.push(val);
					 				
					 		}
					 		
					 		case 2 ->{
					 				
					 				System.out.println(" pop ----> "+st.pop());
					 		}
					 		case 3 ->{
					 				st.display();
					 		}
					 		
					 		case 4->{
					 			System.out.println("Enter the String : ");
					 			String str = sc.nextLine();
					 			boolean flag = checkPalindrome(str.toLowerCase());
					 			if(flag) System.out.println("String is Palindrome");
					 			else System.out.println("Not A Plindrome!!");
					 			
					 			
					 		}
					 		case 5 ->{
					 			System.out.println("Enter the No. : ");
					 			int num = sc.nextInt();
					 			boolean flag = checkPalindromeNo(num);
					 			if(flag) System.out.println("Number is Palindrome");
					 			else System.out.println("Not A Plindrome!!");
					 			
					 		}
					 
					 }
		
			} while(ch != 0);

	}

	private static boolean checkPalindromeNo(int num) {
		
		int temp = num;
		while(temp != 0) {
			st.push(temp%10);
			temp = temp/10;
		}
		temp = num;
		while(temp != 0) {
			if(temp%10 != st.pop()) {
				return false;
			}
			temp = temp / 10;
		}
		return true;
		
	}

	private static boolean checkPalindrome(String str) {
		MyGenericStackList<Character> st = new MyGenericStackList<>();
		for(int i = 0 ;i<str.length();i++) {
			st.push(str.charAt(i));
		}
		
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) != st.pop()) {
				return false;
			}
		}
		return true;
	}

}
