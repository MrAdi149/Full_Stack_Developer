package com.jsp.multithreading.synchornized_method;

public class Main {
	
	public static void main(String[] args) {
		
		Display d = new Display();
		
		Player t1 = new Player(d,"Hitman");
		Player t2 = new Player(d,"King");
		
		t1.start();
		t2.start();
		
	}

}
