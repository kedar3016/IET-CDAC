package com.demo.test;
import java.util.*;
import com.demo.stack.*;

public class TestBalancedPara {
	public static void main(String arg[]) {
		
		String str1 = "{{[](){[]}}}";
		String str2 = "[]{}[]{{{}}]";
		
		boolean status = checkParanthesis(str1);
		if(status) {
			System.out.println("Balanced Parenthesis");
		}
		else {
			System.out.println("UnBalanced Parenthesis");
		}
		
		boolean st = checkParanthesis(str2);
		if(st) {
			System.out.println("Balanced Parenthesis");
		}
		else {
			System.out.println("UnBalanced Parenthesis");
		}
	}

	private static boolean checkParanthesis(String str1) {
		MyGenericStack<Character> st = new MyGenericStack<>();
		
		for(int i = 0;i<str1.length();i++) {
			Character ch = str1.charAt(i);
			
			if(ch == '(' ||ch == '{' || ch == '[') {
				st.push(ch);
			}
			else {
				if(st.isEmpty()) {
					return false;
					
				}
				else {
					Character ch2  = st.pop();
					
					switch(ch) {
								case '}' ->{
									if(ch2 != '{') {
										return false;
									}
								}
								case ']' -> {
									if(ch2 != '[') {
										return false;
									}
								}
								case ')' -> {
									if(ch2 != '(') {
										return false;
									}
								}
					}
				}
			}
			
		}
		return st.isEmpty();
	}

}
