package com.demo.test;

import java.util.Scanner;

import com.demo.stack.MyGenericStack;

public class TestMyStack {

	public static void main(String[] args) {
		MyGenericStack<String> st = new MyGenericStack<>(6);
		
		Scanner sc = new Scanner(System.in);
		
		int ch ;
				 do {
					 System.out.println("============= Menu ===============");
					 System.out.println("\n0 : Exit\n1 : Push \n2 : Pop"
					 		+ "\n3 : Stack Display \n4 : String Palindrome");
					 System.out.println(" ================================= ");
					 System.out.println("Enter the Choice : ");
					 ch = sc.nextInt();
					 
					 sc.nextLine();
					 
					 switch(ch) {
					 		case 0 -> {
					 				System.out.println("Good Bye !!!");
					 		}
//					 		
//					 		case 1 ->{
//					 				System.out.println("Enter the Value : ");
//					 				int val = sc.nextInt();
//					 				st.push(val);
//					 				
//					 		}
					 		
					 		case 2 ->{
					 				
					 				System.out.println(" pop ----> "+st.pop());
					 		}
					 		case 3 ->{
					 				st.display();
					 		}
					 		
					 		case 4->{
					 			System.out.println("Enter the String : ");
					 			String str = sc.nextLine();
					 			boolean flag = checkPalindrome(str);
					 			if(flag) System.out.println("String is Palindrome");
					 			else System.out.println("Not A Plindrome!!");
					 			
					 			
					 		}
					 
					 }
		
			} while(ch != 0);
		 
	}

	private static boolean checkPalindrome(String str) {
		MyGenericStack<Character> st = new MyGenericStack<>(str.length());
		 for(int i = 0;i<str.length();i++) {
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
