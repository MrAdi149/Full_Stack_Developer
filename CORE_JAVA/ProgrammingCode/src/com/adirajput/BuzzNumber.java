package com.adirajput;

import java.util.Scanner;

public class BuzzNumber {
	
	int b;
	
	{
		System.out.println(b);
	}
	
	{
		int b = 1;
		System.out.println(b);
	}
	
	BuzzNumber(){
		int b = 2;
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		
		BuzzNumber bn = new BuzzNumber();
		new BuzzNumber();

		
		if(n%10==7 || n%7==0) {
			System.out.println("it's a buzz number");
		}else {
			System.out.println("not a buzz number");
		}
		
		int a = 0;
		System.out.println(a);
	}

}
