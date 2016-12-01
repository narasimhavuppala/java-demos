package com.multi.exec;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.multi.basic.HelloThread;

public class ExecutorTest {

	public static void main(String[] args) {
		ExecutorService objExe = Executors.newFixedThreadPool(10);
		HelloThread ht=new HelloThread();
		objExe.execute(ht);
		objExe.execute(ht);
		//objExe.shutdown();
	}

}
