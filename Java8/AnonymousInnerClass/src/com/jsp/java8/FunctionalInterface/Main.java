package com.jsp.java8.FunctionalInterface;

public class Main {
	
	public static void main(String[] args) {
		
		Sample sample = new Sample() {

			@Override
			public void run() {
				System.out.println("run..");
				
			}
			
		};
		
		sample.display();
		Sample.execute();
		sample.run();
		
	}

}
