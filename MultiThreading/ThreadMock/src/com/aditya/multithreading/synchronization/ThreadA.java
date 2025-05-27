package com.aditya.multithreading.synchronization;

public class ThreadA {
	
	private int c = 0;
	
	public synchronized void inc() {
		c++;
	}
	
	public synchronized int get() {
		return c;
	}

}
