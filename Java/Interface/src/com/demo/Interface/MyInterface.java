package com.demo.Interface;

public interface MyInterface {
	
	 public default void m1() {
		 System.out.println("In Interface!!!");
	 }
	 
	 public default void m2(String s) {
		 System.out.println("In Interface : M2 Method Name : "+s);
	 }


}
