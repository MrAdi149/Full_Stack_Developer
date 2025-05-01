package com.jsp.multithreading.synchornized_method.task;

public class BankAccount {
	
	synchronized void withdraw(int number, String name) {
		
		System.out.println("withdraw of "+ number +" is done by: " + name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
