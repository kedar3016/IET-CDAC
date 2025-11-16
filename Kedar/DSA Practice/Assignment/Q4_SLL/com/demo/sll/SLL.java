package com.demo.sll;

public class SLL {
	Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public SLL() {
		head = null;
	}
	
	public void addElement(int data) {
		Node newNode = new Node(data);
		if(head == null || head.data > data) {
			newNode.next = head;
			head = newNode;
			return;
		}
	
			Node temp = head;
			
			
			while(temp.next != null && temp.next.data < data) {
				
				temp =temp.next;
			}
			
			newNode.next = temp.next;
			temp.next = newNode;
			
			
			
			
		
	}
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+" ----> ");
			temp = temp.next;
		}
		System.out.println("null");
		
		
	}

}
