package com.demo.list;

public class MyLinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	MyLinkedList(){
		head = null;
	}
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head != null) {
			newNode.next = head;
		}
		head = newNode;
	}
	
	public int[] getadjescentNodes(int[] arr) {
		Node temp = head;
		for(int i = 0;temp!=null&& i<arr.length;i++ ) {
			arr[i]= temp.data;
			temp = temp.next;
		}
		return arr;
	}
	public void display() {
		if(head == null) {
			System.out.println("Empty!!");
		}
		else {
			Node temp = head;
			while(temp != null) {
				System.out.println(temp.data+" ---> ");
				temp = temp.next;
			}
		System.out.println("null\n");
		}
	}
}
