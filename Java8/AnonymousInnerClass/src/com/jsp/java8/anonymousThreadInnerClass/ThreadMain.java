package com.jsp.java8.anonymousThreadInnerClass;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i<=10; i++) {
					System.out.println("Inner Child Thread: " + i);
				}
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		for(int i = 0; i<=10; i++) {
			System.out.println("main Thread: " + i);
		}
		
	}

}
