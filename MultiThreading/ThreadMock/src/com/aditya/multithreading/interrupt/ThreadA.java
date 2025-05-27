package com.aditya.multithreading.interrupt;

public class ThreadA implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("I am a lazy thread"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("i am interrupted");
			}
		}
	}

}
