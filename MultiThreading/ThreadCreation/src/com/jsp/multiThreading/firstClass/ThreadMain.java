package com.jsp.multiThreading.firstClass;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		ThreadA t = new ThreadA();
		
		t.start();
		
		for(int i = 0 ; i<= 10 ; i++) {
			
			System.out.println("ThreadMain: " + i);
			
		}
	}

}
