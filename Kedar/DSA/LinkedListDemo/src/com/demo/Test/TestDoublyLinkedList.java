package com.demo.Test;

import com.demo.LinkedList.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dlist = new DoublyLinkedList();
		dlist.addNewNodeByValue(10);
		dlist.addNewNodeByValue(50);
		dlist.addNewNodeByValue(75);
		dlist.addNewNodeByPos(2,45);
		
		dlist.display();

		
		dlist.deleteByValue(10);
		dlist.display();
		
		dlist.deleteByPos(2);
		dlist.display();
		
//		dlist.deleteByPos(2);
//		dlist.display();

	}

}
