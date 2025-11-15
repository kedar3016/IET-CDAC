package com.demo.test;
import com.demo.list.*;
public class testDLL {

	public static void main(String[] args) {

		DLL dlist = new DLL();
		
		dlist.addNode(10);
		dlist.addNode(20);
		dlist.addAfterValue(30, 20);
		dlist.addAfterValue(40, 10);
	
		dlist.display();

	}

}
