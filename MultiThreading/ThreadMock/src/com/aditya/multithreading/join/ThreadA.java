package com.aditya.multithreading.join;

public class ThreadA extends Thread {
	
	//case-1(when main thread waits for child thread)
	//case-2(when child thread waits for main thread)
	
	public static Thread mt;
	@Override
	public void run() {
		
		try {
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i = 1; i<=10; i++) {
			System.out.println("ThreadA is running..."+i);
		}
	}

}
