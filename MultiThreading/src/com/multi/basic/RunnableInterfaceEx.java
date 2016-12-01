/**
 * 
 */
package com.multi.basic;

/**
 * @author Shree
 *
 */
public class RunnableInterfaceEx implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("Hello From Runnable Thread");
		try {
			Thread.sleep(150000);
			System.out.println(Thread.currentThread().getState());
			System.out.println("After sleep");
			System.out.println(Thread.currentThread().getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Make the program to wait
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RunnableInterfaceEx threadRunTime=new RunnableInterfaceEx();
		Thread t=new Thread(threadRunTime);
		t.start();
		t.interrupt();
		System.out.println(t.getState());
		//t.run();

	}

}
