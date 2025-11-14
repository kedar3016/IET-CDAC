package com.demo.test;
import java.util.*;
import com.demo.Queue.MyQueueList;

public class TestMyQueueList {

	public static void main(String[] args) {
		
				MyQueueList queue = new MyQueueList();
				
				queue.enqueue(10);
				queue.enqueue(20);
				queue.enqueue(30);
				queue.enqueue(40);
				System.out.println(queue.dequeue()+ " Element Deleted!!!");
				System.out.println(queue.dequeue()+ " Element Deleted!!!");



	}

}
