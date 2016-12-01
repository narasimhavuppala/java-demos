package com.multi.basic;

public class HelloThread implements Runnable {
	
	volatile int bankBalance;

	@Override
	public  void run() {
		System.out.println("My First Thread");
		//Code   t1,t2
		synchronized (this) {
			//Thread Sensitive operation
			this.notifyAll();
		}
		//Code 
		

	}

	public static void main(String[] args) throws InterruptedException {
		
		HelloThread ht=new HelloThread();
		//1-10
		Thread t1=new Thread(ht,"Narasimha");
		Thread t2=new Thread(ht,"Narasimha");
		
		t1.join();
		
		//t.run();
		

	}

}
