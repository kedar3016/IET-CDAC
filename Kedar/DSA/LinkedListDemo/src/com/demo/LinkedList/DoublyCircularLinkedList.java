package com.demo.LinkedList;

public class DoublyCircularLinkedList {
	Node head;
	class Node{
		int Data;
		Node next,prev;
		
		public Node(int Data) {
			this.Data = Data;
			next = null;
			prev = null;
		}
	}
	
	public DoublyCircularLinkedList() {
		head = null;
	}
	
	public void display() {
		Node temp = head;
		if(head == null) {
			System.out.println("List is Empty!!");
		}
		while(temp != head) {
			System.out.println(temp.Data+" -----> ");
			temp = temp.next;
		}
		System.out.println(temp.Data+" -----> null");
	}
	
}
