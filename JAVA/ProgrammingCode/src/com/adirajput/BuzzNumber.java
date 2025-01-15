package com.adirajput;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		
		if(n%10==7 || n%7==0) {
			System.out.println("it's a buzz number");
		}else {
			System.out.println("not a buzz number");
		}
	}

}
