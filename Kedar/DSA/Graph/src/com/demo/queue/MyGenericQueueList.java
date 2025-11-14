package com.demo.queue;

public class MyGenericQueueList<T> {
	Node front;
	Node rear;
	class Node{
		T Data;
		Node next;
		
		public Node(T data) {
			this.Data = data;
			this.next = null;
		}
	}
	public MyGenericQueueList() {
		front=null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public void enqueue(T val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			front = newNode;
			
		
		}
		else {
			rear.next = newNode;
			
		}
		rear = newNode;
		
		System.out.println("Added Num "+val);
	}
	public T dequeue() {
		if(!isEmpty()) {
			Node temp = front;
			front = front.next;
			if(front == null) {
				rear = null;
			}
			temp.next = null;
			return temp.Data;
		}
		else {
			System.out.println("Queue is Empty!!");
			return null;
		}
	}

}
