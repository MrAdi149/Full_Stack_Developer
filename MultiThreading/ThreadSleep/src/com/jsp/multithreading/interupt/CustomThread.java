package com.jsp.multithreading.interupt;

public class CustomThread extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i<=10; i++) {
			System.out.println("I am a lazy thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("i am interrupted");
			}
		}
	}

}
