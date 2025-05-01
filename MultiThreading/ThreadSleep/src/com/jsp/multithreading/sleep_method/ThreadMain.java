package com.jsp.multithreading.sleep_method;

public class ThreadMain {

	
	
	public static void main(String[] args) {
		CustomThread cu = new CustomThread();
		CustomThread.mt = Thread.currentThread();  // case 2: child threads wait for main Thread

		cu.start();
//		try { 
//			cu.join(); --------------------------> case 1: main threads wait for child thread
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		 try {            
			cu.join(1000); //--------------------------> case 3: when both the class executing the thread same time
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		for(int i = 0; i<=10; i++) {
			System.out.println("main thread: " + i);
		}
	}

}
