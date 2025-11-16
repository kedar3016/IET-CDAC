package com.demo.stack;

public class MyGenericStackList<T>{
	
	Node top;
	class Node{
		 T data;
		 Node next;
		 
		 public Node(T data) {
			 this.data = data;
			 next = null;
		 }
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(T data) {
		Node newNode = new Node(data);
	
		if(!isEmpty()) {
			newNode.next = top;
		}
		
		top = newNode;
		System.out.println(data +" pushed ");
		
	}
	public T pop() {
		if(!isEmpty()) {
			Node temp = top;
			top  = temp.next;
			temp.next = null;
			return temp.data;
		}
		return null;
	}
	
	public void display() {
		if(!isEmpty()) {
			Node temp = top;
			while(temp != null){
				System.out.println("| "+temp.data+ " |"
						+"\n ---- ");
				temp = temp.next;
			}
		}
		else {
			System.out.println("Stack is Empty!!");
		}
	}
		
}
