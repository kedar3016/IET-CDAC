package com.demo.CSLL;

public class CSLL {
	Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public CSLL() {
		head = null;
	}
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			
			head = newNode;
			
		}
		else {
			Node temp = head;
			while(temp.next != head) {
				temp = temp.next;
		}
		
				
				temp.next = newNode;
		}
		
		newNode.next = head;
	}
	
	public void addByPos(int val,int pos) {
		Node newNode = new Node(val);
		if(pos== 1) {
			if(head == null) {
				head = newNode;
				newNode.next=head;
			}
			else {
				Node tail = head;
				while(tail.next != head) {
					tail= tail.next;
				}
				newNode.next = head;
				head = newNode;
				tail.next = head;
			
			}
		}
		else {
			Node temp = head;
			int i = 1;
			for(;temp.next!= head && i <= pos-2;i++) {
				temp = temp.next;
			}
			if(i>pos-2) {
					newNode.next = temp.next;
					temp.next = newNode;
			}
			
		}
	}
	
	public void display() {
		Node temp = head;
		while(temp.next != head) {
			System.out.print(temp.data+" ----> ");
			temp = temp.next;
		}
		System.out.print(temp.data+" ----> ");
		System.out.println("null");
	}

}
