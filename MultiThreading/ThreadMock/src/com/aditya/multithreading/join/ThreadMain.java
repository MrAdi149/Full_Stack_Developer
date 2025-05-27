package com.aditya.multithreading.join;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		ThreadA.mt = Thread.currentThread();
		
		ThreadA a = new ThreadA();
		a.start();
		
//		try {
//			a.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		for(int i = 1; i<=10; i++) {
			System.out.println("MainThread is running..."+i);
		}
		
	}

}
