package com.aditya.multithreading.sleep;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		ThreadA t = new ThreadA();
		t.start();
		for(int i = 1; i<=10; i++) {
			System.out.println("Main method is running..."+i);
		}
		
	}

}