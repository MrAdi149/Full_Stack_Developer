package com.jsp.multithreading.thred_priority;

public class ThreadMain {
	
	public static void main(String[] args) {
		CustomThread t = new CustomThread();
		t.setPriority(1);
		Thread.currentThread().setPriority(10);
		t.start();
		for(int i = 0; i<=10;i++) {
			System.out.println("Main Thread: " + i);
		}
	}

}
