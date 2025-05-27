package com.aditya.multithreading.RunnableInterface;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		ThreadA t = new ThreadA();
		Thread thread = new Thread(t);
		thread.start();
		
		for(int i = 1; i<=10; i++) {
			System.out.println("Maint thread is running..."+i);
		}
		
	}

}
