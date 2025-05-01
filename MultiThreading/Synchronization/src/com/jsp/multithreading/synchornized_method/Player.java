package com.jsp.multithreading.synchornized_method;

public class Player extends Thread {

	
	Display d;
	String name;
	
	Player(Display d, String name){
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
	
}
