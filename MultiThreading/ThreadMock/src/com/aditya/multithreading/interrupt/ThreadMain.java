package com.aditya.multithreading.interrupt;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		ThreadA a = new ThreadA();
		
		Thread t = new Thread(a);
		
		t.start();
		
		for(int i = 1; i<=10; i++) {
			System.out.println("Main Thread is running..."+i);
		}
		
		t.interrupt();
		
	}

}
