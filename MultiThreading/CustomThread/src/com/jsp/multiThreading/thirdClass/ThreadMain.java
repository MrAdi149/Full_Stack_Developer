package com.jsp.multiThreading.thirdClass;

public class ThreadMain {

	public static void main(String[] args) {
		
		CustomThread custom = new CustomThread();
		
		Thread thread = new Thread(custom);
		thread.start();
		
		for(int i = 0; i<=10; i++) {
			System.out.println("Main thread "+i);
		}
		
		
		
	}
	
	
}
