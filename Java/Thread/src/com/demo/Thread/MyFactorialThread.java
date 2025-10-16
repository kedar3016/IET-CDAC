package com.demo.Thread;

import com.demo.bean.MyClass;

public class MyFactorialThread extends Thread{
	private MyClass ob;
	private int n;
	public MyFactorialThread(MyClass ob, int n) {
		super();
		this.ob = ob;
		this.n = n;
	}
	public void run() {
		int ans = ob.factorial(n);
		System.out.println("Factorial is : "+ans);
	}

}
