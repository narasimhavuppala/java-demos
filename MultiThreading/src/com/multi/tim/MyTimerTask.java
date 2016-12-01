/**
 * 
 */
package com.multi.tim;

import java.util.TimerTask;
import java.util.Timer;

/**
 * @author Shree
 *
 */
public class MyTimerTask extends TimerTask {

	/* (non-Javadoc)
	 * @see java.util.TimerTask#run()
	 */
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Timer mytime=new Timer();
		System.out.println("Started");
		mytime.schedule(new MyTimerTask(),10*1000);
		//mytime.cancel();
	}

}
