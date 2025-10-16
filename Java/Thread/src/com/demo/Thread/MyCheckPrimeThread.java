package com.demo.Thread;

import com.demo.bean.MyClass;

public class MyCheckPrimeThread implements Runnable{
		private MyClass ob;
		private int n;
		
		public void run() {
			boolean status = ob.checkPrime(n);
			if(status){
				System.out.println("Is a prime Number!!");
			}
			else {
				System.out.println("Is Not A Prime Number!!");
			}
		}

		public MyCheckPrimeThread(MyClass ob, int n) {
			super();
			this.ob = ob;
			this.n = n;
		}

}
