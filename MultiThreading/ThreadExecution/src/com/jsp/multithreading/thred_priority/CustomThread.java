package com.jsp.multithreading.thred_priority;

public class CustomThread extends Thread {
	
	
	@Override
	public void run() {
		
		for(int i = 0; i<=10; i++) {
			System.out.println("Child Thread: " + i);
			Thread.yield();
		}
		
	}

}
