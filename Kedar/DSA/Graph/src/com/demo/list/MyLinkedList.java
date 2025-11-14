package com.demo.list;

public class MyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
			
		}
	}
	
	public MyLinkedList() {
		head = null;
	}
	
	public void addNode(int val) {
		Node newNode = new Node(val);
		
		if(head != null) {
			newNode.next = head;
		}
			head = newNode;
			
		
	}
	
	public void display() {
		
		if(head ==null) {
			System.out.println("null");
		}
		else {
				Node temp = head;
				while(temp != null) {
					System.out.print(temp.data+" -----> ");
					temp = temp.next;
				}
				System.out.println("null");
				
			}
		}
	
	public boolean search(int val) {
		if(head == null) {
			return false;
		}
		else {
			Node temp = head;
			
			while(temp != null && temp.data != val) {
				temp = temp.next;
			}
			if(temp.data == val) {
				return true;
			}
		}
		return false;
	}
	
	public int[] adjescentsNode(int[] arr) {
		Node temp = head;
		for(int i = 0;temp!= null && i<arr.length;i++) {
			arr[i] = temp.data;
			temp = temp.next;
		}
		return arr;
	}
	

}
