package com.jsp.multithreading.synchornized_method.task;

public class JoinAccount extends Thread {
	
	BankAccount b;
	int number;
	String name;
	
	JoinAccount( String name,  int number, BankAccount b){
		this.name = name;
		this.b = b;
		this.number = number;
	}
	
	@Override
	public void run() {
		b.withdraw(number, name);
	}

}
