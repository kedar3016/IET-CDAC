package com.demo.Stack;

public class MyStackList {
	Node top;
	class Node{
		int Data;
		Node next;
		
		public Node(int data) {
			this.Data = data;
			this.next = null;
		}
	}
	
	public MyStackList() {
		top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(int val) {
		Node newNode = new Node(val);
		if(!isEmpty()) {
			newNode.next = top;
		}
		top = newNode;
		System.out.println(val + " Pushed !!");
	}
	public int pop() {
		if(!isEmpty()) {
			Node temp = top;
			top = temp.next;
			temp.next = null;
			return temp.Data;
		}
		else {
			System.out.println("Stack is Empty!!!");
			return -1;
		}
	}

	public void display() {
		if(!isEmpty()) {
		Node temp = top;
		while(temp.next!= null) {
			System.out.println("| "+temp.Data+" |");
			System.out.println(" ----- ");
			temp = temp.next;
		}
		}
		else {
			System.out.println("Stack is Empty!!");
		}
		
		
	}

}
