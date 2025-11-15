package com.demo.list;

import java.util.List;
import java.util.*;

public class SLL {
	Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next  = null;
		}
	}
	
	public SLL() {
		head = null;
	}
	
	public boolean AddNewNode(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			
			
		}
		else {
			Node temp = head;
					while(temp.next!= null) {
						temp = temp.next;
					}
					
						temp.next = newNode;
					
		}
		return true;
	}
	
	public void display() {
		Node temp = head;
		while(temp!= null) {
			System.out.print(temp.data + " ---> ");
			temp = temp.next;
		}
		System.out.print("null");
	}

	public void revDisplay() {
		Node temp = head;
		List<Integer> arr = new ArrayList<>();
		while(temp!= null) {
			arr.add(temp.data);
			temp = temp.next;
		}
		System.out.print("null");
		for(int i = arr.size() - 1;i>=0;i--) {
			System.out.print(" ----> "+arr.get(i) );
		}
		
	}

	public void deletePrime() {
		
		if(head == null) {
			System.out.println("Emptyy!!");
		}
		else {
			
			
			Node temp = head;
			
			
			while(temp != null) {
				if(isPrime(temp.data)) {
					int val = temp.data;
					temp = temp.next;
					deleteNode(val);
				}
				else
					temp = temp.next;
			}
			
		}
		
	}

	private void deleteNode(int key) {
		
		if(head==null) {
			System.out.println("Empty!!");
		}
		else {
			Node temp = head;
			if(head.data == key) {
				head = head.next;
				temp.next = null;
			}
			else {
				Node prev = null;
				while(temp!=null && temp.data != key) {
					prev = temp;
					temp = temp.next;
				}
				
				if(temp!= null) {
					prev.next = temp.next;
					temp.next = null;
					
				}
				
			}
		}
		
	}

	private boolean isPrime(int num) {
		if(num == 2) {
			return true;
		}
		else {
			for(int i=2 ;i<num - 1;i++) {
				if(num % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public void reverseList() {
		Node prev = null;
		Node temp = head;
		
		while(temp != null) {
			Node next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		head = prev;
	}

	public void addBeforeValue(int val, int num) {
		Node newNode = new Node(val);
		if(head==null) {
			head = newNode;
		}
		else {
			if(head.data == num) {
				newNode.next = head;
				head = newNode;
			}
			else {
				Node prev =null;
				Node temp = head;
				while(temp != null && temp.data != num) {
					prev = temp;
					temp = temp.next;
					
				}
				
				if(temp.data == num) {
					newNode.next = temp;
					prev.next = newNode;
					
				}
			}
		}
		
	}

}
