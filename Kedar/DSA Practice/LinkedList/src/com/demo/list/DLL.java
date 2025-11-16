package com.demo.list;

public class DLL {
		Node head;
		class Node{
			int data;
			Node next;
			Node prev;
			
			public Node(int data) {
				this.data = data;
				next = null;
				prev = null;
			}
		}
		
		public DLL() {
			head = null;
		}
		
		public void addNode(int data) {
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
			}
			else {
					Node temp = head;
					while(temp.next != null) {
						temp = temp.next;
					}
					
					newNode.prev = temp;
					temp.next = newNode;
			}
		}
		
		public void display(){
			
			if(head ==null) {
				System.out.println("List is Empty!!");
			}
			else {
					Node temp = head;
					
					while(temp != null) {
						System.out.print(temp.data+" ----> ");
						temp = temp.next;
					}
					System.out.println("null");
					
				}
			
		}

		public void displayRev() {
			reversePrint(head);
			System.out.println("null");
			
		}

		private void reversePrint(Node head) {
			if(head == null) {
				return;
			}
			
			reversePrint(head.next);
			System.out.print(head.data +" ----> ");
			
		}

		public void addBeforeVal(int num, int val) {
			// TODO Auto-generated method stub
			if(head == null) {
				System.out.println("List is Empty!!");
				return;
			}
			else {
				Node newNode = new Node(val);
				if(head.data == num) {
					newNode.next = head;
					head.prev = newNode;
					head = newNode;
					return;
				}
				else {
					Node prev = null;
					Node temp = head;
					
					while(temp != null && temp.data != num) {
						prev = temp;
						temp =temp.next;
					}
					
					if(temp != null) {
						newNode.next = temp;
						newNode.prev = prev;
						if(prev != null) {
							prev.next =newNode;
						}
					}
				}
			}
			
		}
}
