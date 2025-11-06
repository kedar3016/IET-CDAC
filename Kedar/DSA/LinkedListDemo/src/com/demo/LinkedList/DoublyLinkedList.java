package com.demo.LinkedList;

public class DoublyLinkedList {
	Node head;
	class Node{
		int Data;
		Node prev,next;
		
		public Node(int Data) {
			this.Data = Data;
			next = null;
			prev = null;
		}
	}
	
	public DoublyLinkedList() {
		head = null;
		
	}
	
	public void addNewNodeByValue(int val) {
		Node newNode = new Node(val);
		
		if(head == null) {
			
			head = newNode;
			
		}
		else {
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
				
			}
				temp.next = newNode;
				newNode.prev = temp;
				
			
			}
		
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.Data+" -------> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public void addNewNodeByPos(int pos,int value) {
		Node newNode = new Node(value);
		if(pos == 1) {
			head = newNode;
		}
		else {
			Node temp = head;
			for(int  i = 1;temp != null && i <= pos-2;i++) {
				temp = temp.next;
			}
			if(temp!=null) {
				newNode.next = temp.next;
				newNode.prev = temp;
				temp.next = newNode;
				if(temp.next != null) {
					temp.next.prev = newNode;
				}
			}
		
		}
	}

	public void deleteByValue(int value) {

		Node temp = head;
		if(head.Data == value) {
			head.next.prev = null;
			head = temp.next;
			temp.next = null;
			}
		else {
			while(temp != null && temp.Data != value) {
				temp = temp.next;
			}
			if(temp != null) {
				temp.prev.next = temp.next;
				if(temp.next != null) {
				temp.next.prev = temp.prev;
				temp.next = null;
				}
				
				temp.prev = null;
			}
			else {
				System.out.println("Value Not Found!!!");
			}
		}
		
	}
	
	public void deleteByPos(int pos) {
		Node temp = head;
		if(pos == 1) {
			head = temp.next;
			temp.prev = null;
			
		}
		else {
			for(int i = 1;temp!= null && i<=pos-1;i++) {
				temp = temp.next;
			}
			if(temp != null) {
				temp.prev.next  = temp.next;
				if(temp.next != null) {
					temp.next.prev = temp.prev;
					temp.next = null;
				}
				temp.prev = null;
			}
				else {
					System.out.println("Not Found!!!");
				}
			}
	}
	


}
