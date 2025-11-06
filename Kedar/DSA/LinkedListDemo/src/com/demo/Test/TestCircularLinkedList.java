package com.demo.Test;

import com.demo.LinkedList.CircularLinkedList;

public class TestCircularLinkedList {

	public static void main(String[] args) {

		CircularLinkedList clist = new CircularLinkedList();
		clist.addNewNode(10);
		clist.addNewNode(50);
		clist.addNewNode(40);
		clist.addByPos(2, 30);
		clist.addByPos(5,70);
		clist.display();
//		clist.addAfterNum(60, 40);
		clist.deleteByValue(10);
		clist.display();
		clist.deleteByValue(40);
		clist.display();
		

	}

}
