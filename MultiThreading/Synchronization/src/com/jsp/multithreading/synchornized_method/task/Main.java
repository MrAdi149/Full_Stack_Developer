package com.jsp.multithreading.synchornized_method.task;

public class Main {
	
	public static void main(String[] args) {
		
		BankAccount bank = new BankAccount();
		
		JoinAccount join1 = new JoinAccount("Aditya",3000,bank);
		JoinAccount join2 = new JoinAccount("Papa",1000,bank);
		
		join1.start();
		join2.start();
		
	}

}
