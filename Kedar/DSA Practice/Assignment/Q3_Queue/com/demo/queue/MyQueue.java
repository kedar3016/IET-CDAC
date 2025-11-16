package com.demo.queue;

public class MyQueue {
	
	int front;
	int rear;
	int arr[];
	
	public MyQueue() {
		arr = new int[5];
		front =-1;
		rear = -1;
	}
	public MyQueue(int size) {
		arr = new int[size];
		front =-1;
		rear = -1;
	}
	
	public boolean isEmpty() {
		if(front == -1 || front>rear) {
			System.out.println("Queue");
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(front == 0 && rear == arr.length-1) {
			return true;
		}
		else if(front == rear+1) {
			return true;
		}
		return false;
	}
	
	public boolean enQueue(int data) {
		if(!isFull()) {
			if(front == -1) {
				front = 0;
			}
			rear = (rear+1)/arr.length;
			arr[rear] = data;
			System.out.println("Added Successfully "+data);
			return true;
		}
		return false;
	}
	
	public int deQueue() {
		if(!isEmpty()) {
			int n = arr[front];
			if(front == rear) {
				front = -1;
				rear = -1;
			}
			else {
				front = (front+1)%arr.length;
				
			}
			return n;
		}
		return -1;
	}
	
	public void display() {
		if(!isEmpty()) {
			System.out.println("Queue Empty!!");
		}
		else {
			for(int  i = front ;i <= rear;i++) {
				System.out.print(" | "+arr[i]+" | ");
			}
		}
	}

}
