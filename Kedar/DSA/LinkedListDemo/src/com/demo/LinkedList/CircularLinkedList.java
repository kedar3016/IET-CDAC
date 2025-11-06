package com.demo.LinkedList;

public class CircularLinkedList {
	Node head;
	class Node{
		int Data;
		Node next;
		
		public Node(int data) {
			this.Data = data;
			this.next = null;
			
		}
	}
	public CircularLinkedList() {
		head = null;
	}
	
	public void addNewNode(int val) {
		
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
			newNode.next = head;
		}
		else {
			Node temp = head;
			while(temp.next != head) {
				temp =temp.next;
			}
			temp.next = newNode;
			
			System.out.println("New Added!!!");
		}
		newNode.next = head;
		
	}
	
	public void addByPos(int pos,int val) {
		Node newNode = new Node(val);
		if(head == null) {
			System.out.println("List is Empty");
		}else {
		
			if(pos == 1) {
				head = newNode;
				newNode.next = head;
			}
			else {
				Node temp = head;
				int i = 1 ;
				for(;temp.next != head && i <= pos - 2;i++) {
					temp=temp.next;
					
				}
				if(i > pos-2) {
					newNode.next = temp.next;
					temp.next = newNode;
				}
				else {
					System.out.println("Given Position "+ pos +" is length of the list");
				}
			}
		}
	}
	
	public void addAfterNum(int val,int num) {
		Node newNode = new Node(val);
		if(head.Data == num) {
			newNode.next = head.next;
			head.next = newNode;
		}
		else {
			Node temp = head;
			do {
				temp = temp.next;
				
			}while(temp != head && temp.Data == num);
			temp = temp.next;
			if(temp != head) {
			newNode.next = temp.next;
			temp.next = newNode;
			}else {
				System.out.println("Not Found!!");
			}
			
		}
	}
	
	
	public void deleteByValue(int val) {
		if(head == null) {
			System.out.println("List is Empty!!");
		}
		else {
			Node temp = head;
			if(head.Data == val) {
				Node tail = head;
				while(tail.next != head) {
					tail= tail.next;
				}
				if(tail==head) {
					head = null;
				}else {
					head = head.next;
					temp.next = null;
					tail.next = head;
				}
			}
			else {
				Node prev = null;
				int i = 0;
				for(;temp.next != head && temp.Data != val;i++) {
					prev = temp;
					temp =temp.next;
					
				}
				if(temp.Data == val) {
					prev.next = temp.next;
					temp.next = null;
				}
				else {
					System.out.println("Not found!!!");
				}
			}
		}
	}
	
	public void display() {
		Node temp = head;
		if(head == null) {
			System.out.println("List is Empty!!");
			
		}
		else {
		while(temp.next != head) {
			System.out.print(temp.Data+" -----> ");
			temp = temp.next;
		}
		System.out.print(temp.Data+" -----> ");
		System.out.println("null");
	}
	}
}
