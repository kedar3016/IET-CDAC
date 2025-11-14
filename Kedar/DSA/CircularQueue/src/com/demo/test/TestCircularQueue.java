package com.demo.test;

import com.demo.Queue.MyCircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {

		MyCircularQueue cqueue = new MyCircularQueue();
		
		cqueue.enQueue(10);
		cqueue.enQueue(20);
		cqueue.enQueue(30);
		cqueue.enQueue(40);
		cqueue.enQueue(50);
		cqueue.deQueue();
		cqueue.deQueue();
		

	}

}
