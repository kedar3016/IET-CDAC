package com.demo.Test;

import com.demo.LinkedList.*;

public class TestLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addNodeByValue(12);
		list.addNodeByValue(10);
		list.addNodeByValue(40);
		list.addNodeByValue(80);
		list.displayData();
		list.addNodeByPos(2,45);
		list.addNodeByPos(1, 14);
		list.displayData();
		list.addAfterNum(14,10);
		list.addAfterNum(2,40);
		
		
		
		list.displayData();
		
		list.deleteByValue(10);
		list.deleteByValue(12);
		list.addNodeByPos(2);
		list.displayData();
	}

}
