package com.demo.Test;

import com.demo.bean.MyClass;
import com.demo.Thread.*;

public class TestMyClass {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		
		MyCheckPrimeThread p1 = new MyCheckPrimeThread(ob,7);
		Thread th = new Thread(p1);
		th.start();
		
		MyFactorialThread f = new MyFactorialThread(ob,6);
		f.start();
		
		
		MyPrintTableThread t1 = new MyPrintTableThread(3,ob);
		t1.start();
		MyPrintTableThread t2 = new MyPrintTableThread(7,ob);
		t2.start();
		
		
			try {
				th.join();
				t1.join();
				f.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		System.out.println("main function continues....");
		
	}

}
