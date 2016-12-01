package com.multi.inter;

public class InterThreadComm {

	public static void main(String[] args) throws InterruptedException {
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		Thread t2 = new Thread(obj);
		t.start();
		t2.start();
		System.out.println(obj.bankBalance);

	}

}

class MyThread implements Runnable {

	int bankBalance = 0;

	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bankBalance = bankBalance + i;
		}
	}

}
