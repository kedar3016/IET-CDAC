package com.demo.list;

public class DLL {
	Node head;
	class Node{
		int data;
		Node prev;
		Node next;
		
		public Node(int data) {
			this.data = data;
			prev = null;
			next = null;
		}
	}

	public DLL() {
		head = null;
	}
	
	public void addNode(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = newNode;
			newNode.prev = temp;
			
		}
	}
	
	public void addAfterValue(int val,int num) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
		}else {
			if(head.data == num) {
				head.next = newNode;
				newNode.prev = head;
			}
			else {
				Node temp = head;
				
				while(temp != null && temp.data != num) {
					temp = temp.next;
				}
				if(temp != null) {
					newNode.next = temp.next;
					newNode.prev = temp;
					if(temp.next != null) {
					temp.next.prev=newNode;
					}
					temp.next = newNode;
				}
				else {
					System.out.println("Number Not Found!!");
				}
			}
		}
		
		
	}

	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" -----> ");
			temp = temp.next;
		}
		System.out.println("null");
		
	}
}
