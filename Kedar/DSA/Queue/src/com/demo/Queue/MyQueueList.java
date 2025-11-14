package com.demo.Queue;

public class MyQueueList {
	Node front;
	Node rear;
	class Node{
		int Data;
		Node next;
		
		public Node(int data) {
			this.Data = data;
			this.next = null;
		}
	}
	public MyQueueList() {
		front=null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public void enqueue(int val) {
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
	public int dequeue() {
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
			return -1;
		}
	}

}
