package com.demo.stack;



public class MyGenericStack<T> {
	Node top;
	class Node{
		T Data;
		Node next;
		
		public Node(T data) {
			this.Data = data;
			this.next = null;
		}
	}
	
	public MyGenericStack() {
		top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(T val) {
		Node newNode = new Node(val);
		if(!isEmpty()) {
			newNode.next = top;
		}
		top = newNode;
		System.out.println(val + " Pushed !!");
	}
	public T pop() {
		if(!isEmpty()) {
			Node temp = top;
			top = temp.next;
			temp.next = null;
			return temp.Data;
		}
		else {
			System.out.println("Stack is Empty!!!");
			return null;
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
