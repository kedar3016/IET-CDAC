package com.demo.LinkedList;

public class SinglyLinkedList {
	
	Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public SinglyLinkedList() {
		head = null;
	}
	
	public void addNodeByValue(int value) {
		Node newNode = new Node(value);
		
		if(head == null) {
			head = newNode;
		}
		else 
		{
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			
			if(temp != null) {
			temp.next = newNode;
			}
			

	}
		
}
	public void displayData() {
		if(head == null) {
			System.out.println("Empty List!!!");
		}
		else {
			for(Node temp = head;temp != null;temp = temp.next) {
				System.out.print(temp.data+ " -----> ");
			}
			System.out.print("null");
		}
		System.out.println();
	}

	public void addNodeByPos(int pos, int value) {
		Node newNode = new Node(value);
		if(pos == 1) {
			newNode.next = head;
			head = newNode;
			
		}else {
			Node temp = head;
			for(int i = 1;temp!=null&&i<=pos-2;i++) {
				temp = temp.next;
			}
			
			if(temp != null) {
				newNode.next = temp.next;
				temp.next = newNode;
			}
			else {
				System.out.println(value+" Not Found!!!");
			}
		}
		
	}

	public void deleteByValue(int value) {
		Node temp = head;
		
		if(head.data == value) {
			
			head = temp.next;
			temp.next = null;
			
		}
		else {
			Node prev = temp;
			while(temp != null && temp.data != value) {
				 prev = temp;
				temp = temp.next;
			}
			
			if(temp != null) {
				prev.next= temp.next;
				temp.next = null;
			}
			else {
				System.out.println("Not Found!!!");
			}
			
		}
		
	}

	public void addNodeByPos(int pos) {
		Node temp = head;
		if(pos == 1) {
			head = temp.next;
			temp.next = null;
		}
		else {
			Node prev = temp;
			for(int i = 1;temp != null && i<=pos-1;i++) {
				prev = temp;
				temp = temp.next;
			}
			if(temp!= null) {
				prev.next = temp.next;
				temp.next = null;
			}
			else {
				System.out.println("Not Found!!!");
			}
		}
		
	}

	public void addAfterNum(int value, int num) {
		
		Node newNode = new Node(value);
		if(head.data == num) {
			newNode.next = head;
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp!= null&&temp.data != num) {
				temp = temp.next;
			}
			if(temp != null) {
				newNode.next = temp.next;
				temp.next = newNode;
			}
			else {
				System.out.println("Error!!");
			}
		}
		// TODO Auto-generated method stub
		
	}
}
