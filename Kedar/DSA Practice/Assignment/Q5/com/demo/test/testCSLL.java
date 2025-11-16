package com.demo.test;

import com.demo.CSLL.CSLL;

public class testCSLL {

	public static void main(String[] args) {
		
		CSLL cslist = new CSLL();
		
		cslist.addByPos(45, 1);
//		cslist.addNode(10);
//		
//		cslist.addNode(20);
		cslist.addNode(30);
		cslist.addNode(40);
		cslist.addByPos(15, 3);
		
		cslist.display();
		

	}

}
