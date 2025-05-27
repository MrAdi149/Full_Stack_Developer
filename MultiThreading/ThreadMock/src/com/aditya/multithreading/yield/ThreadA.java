package com.aditya.multithreading.yield;

public class ThreadA extends Thread {
	
	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("ThreadA is running..."+i);
		}
		Thread.yield();
	}

}