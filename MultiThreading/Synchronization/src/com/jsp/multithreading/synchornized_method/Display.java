package com.jsp.multithreading.synchornized_method;

public class Display {
	
	synchronized void wish(String name) {
		for(int i = 0; i<=5; i++) {
			System.out.println("Good Morning: " + name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
