package com.jsp.multithreading.sleep_method;

public class CustomThread extends Thread {
	
	static Thread mt;  // case 2: child threads wait for main Thread
	
	@Override
	public void run() {
		try {
			mt.join(1000);  // case 2: child threads wait for main Thread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 0; i<=10; i++) {
			System.out.println("Child Thread: " + i);
			try {
				Thread.sleep(1000,500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
