package com.demo.Stack;

public class MyStackArray {
	private int arr[];
	private int top;
	
	public MyStackArray() {
		arr = new int [10];
		top = -1;
		
	}
	public MyStackArray(int size) {
		arr = new int [size];
		top = -1;
		
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == arr.length-1;
	}
	
	public void push(int val) {
		if(!isFull()) {
			top++;
			arr[top] = val;
			System.out.println(val +" Pushed !!");
		}
		else {
			System.out.println("Stack is OverFlow!!");
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int val = arr[top];
			top--;
			return val;
			
			
		}
		else {
			System.out.println("Stack is Empty!!!");
			return top;
		}
		
		
	}
	
	public void display() {
		if(!isEmpty()) {
			for(int i = top;i>=0;i--) {
				System.out.println("| "+arr[i]+" |");
				System.out.println(" ----- ");
			}
		}
		else {
			System.out.println("Stack is Empty!!!");
		}
	}

}
