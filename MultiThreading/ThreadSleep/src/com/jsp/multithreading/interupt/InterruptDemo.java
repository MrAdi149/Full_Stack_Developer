package com.jsp.multithreading.interupt;

public class InterruptDemo {
	
	public static void main(String[] args) {
		
		CustomThread t = new CustomThread();
		t.start();		
		System.out.println("I am main thread");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.interrupt();
		
	}

}
