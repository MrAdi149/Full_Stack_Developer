package com.aditya.multithreading.RunnableInterface;

public class ThreadA implements Runnable {
	
	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("ThreadA is running..."+i);
		}
	}
}
