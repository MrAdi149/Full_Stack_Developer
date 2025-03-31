package com.adirajput;

import java.util.Scanner;

public class CardInfo {
	
	long accNum;
	String cardName,custName;
	int cvv;
	String expDate;
	int amount;
	
	Scanner sc = new Scanner(System.in);
	
	void information() {
		System.out.print("Enter your Name: ");
		custName = sc.nextLine();
		System.out.print("Enter your account Number: ");
		accNum = sc.nextLong();
		System.out.print("Enter your cvv number: ");
		cvv = sc.nextInt();
		System.out.println(cvv + " is the cvv number");
		System.out.print("Enter your total amount: ");
		amount = sc.nextInt();
		System.out.println("Hy! " + custName + " we had created your account with this " + accNum + " account number.");
	}
	
	void swipe() {
		System.out.println(custName + " you swiped the card successfully!");
	}
	
	public static void main(String[] args) {
		CardInfo ci = new CardInfo();
		ci.information();
	}
}
