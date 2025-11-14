package com.demo.hashtable;

public class MyHashTable {
	
	Node[] heads;
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public MyHashTable() {
		heads = new Node[10];
		for(int i = 0;i<10;i++) {
			heads[i] = null;
		}
	}
	
	public MyHashTable(int size) {
		heads = new Node[size];
		for(int i = 0;i<size;i++) {
			heads[i] = null;
		}
	}
	
	public void insertData(int val) {
		Node newNode = new Node(val);
		
		int pos = val % heads.length;
		
		if(heads[pos] != null) {
			newNode.next = heads[pos];
		}
		heads[pos] = newNode;
	}
	
	
	
	public void display() {
		for(int i =0 ;i<heads.length;i++) {
			Node temp = heads[i];
			System.out.print(i+" ----> ");
			while(temp != null) {
				System.out.print(temp.data+" ----> ");
				temp = temp.next;
			}
			System.out.println("null");
		}
	}
	
public boolean deleteData(int key) {
	int pos = key%heads.length;
	
	if(heads[pos] == null) {
		System.out.println("Element Not Found!!");
	}
	else {
		Node temp = heads[pos];
		Node prev = null;
			
			if(heads[pos].data == key) {
					heads[pos] = temp.next;
					temp.next = null;
					return true;
				}
			else {
		
					while(temp != null && temp.data != key) {
						prev = temp;
						temp = temp.next;
						
					}
					if(temp!=null) {
						if(temp.data == key) {
							prev.next = temp.next;
							if(temp.next != null) {
							temp.next = null;
							}
							return true;
						}
					}
						
					}
			
			
					
			
						
					}
	
			return false;
		
		}
}


