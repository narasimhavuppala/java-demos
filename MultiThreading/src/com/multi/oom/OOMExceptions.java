package com.multi.oom;

public class OOMExceptions implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5000;i++){
		Thread t =new Thread(new OOMExceptions());
		t.start();
		
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(145000);
			System.out.println("Thread Resume");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
