package com.aditya.multithreading.sleep;

public class ThreadA extends Thread {
	
	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("ThreadA is running..."+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
