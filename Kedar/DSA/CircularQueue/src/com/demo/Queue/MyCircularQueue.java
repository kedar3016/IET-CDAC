package com.demo.Queue;

public class MyCircularQueue {
	
	int[] arr;
	int front;
	int rear;
	
	public MyCircularQueue() {
		arr = new int[10];
		front = -1;
		rear = -1;
	}
	public MyCircularQueue(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	
	public boolean isEmpty() {
		if(front == -1) {
			System.out.println("Queue is Empty!!");
			return false;
		}
		return true;
	}
	
	public boolean isFull() {
		if(front == 0 && rear == arr.length - 1) {
			return false;
		}
		else if(front == rear+1){
			return true;
		}
		return false;
	}
	
	public boolean enQueue(int num) {
		if(!isFull()) {
			if(front == -1) {
				front = 0;
			}
			rear = (rear + 1) % arr.length;
			arr[rear] = num;
			System.out.println("Added Successfully!!");
			return true;
		}
		return false;
	}
	
	public int deQueue() {
		if(!isEmpty()) {
			int n  = arr[front];
			if(front == rear) {
				front = -1;
				rear = -1;
				
			}
			else {
				front = (front + 1)%arr.length;
				System.out.println("Deleted Succesfully!!");
			}
			return n;
			
		}
		return -1;
	}
	
	

}
