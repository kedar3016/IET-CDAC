package com.demo.stack;

public class MyGenericStack<T> {
	private int top;
	private T arr[];
	
	@SuppressWarnings("unchecked")
	public  MyGenericStack() {
		this.arr= (T[])new Object[5];
		top = -1;
	}
	
	@SuppressWarnings("unchecked")
	public  MyGenericStack(int size) {
		this.arr= (T[])new Object[size];
		top = -1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == arr.length-1;
	}
	
	public void push(T data) {
		if(!isFull()) {
			top++;
			arr[top] = data;
			System.out.println(data +" pushed!!");
		}
		else {
			System.out.println("Stack is Overflow!!");
		}
		
	}
	
	public T pop() {
		if(!isEmpty()) {
			T val = arr[top];
			top--;
			return val;
		}
		System.out.println("Stack Empty!!");
		return null;
		

	}

	public void display() {
		if(!isEmpty()) {
			for(int i = top ;i>=0;i--) {
				System.out.println("| "+arr[i]+" |" );
				System.out.println("  --- ");
			}
		}
		else {
			System.out.println("Stack Empty!!!");
		}
		
		
	}

	
}
