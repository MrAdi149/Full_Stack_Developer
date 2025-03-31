package com.adirajput;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		while(n!=0) {
			int lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n = n / 10;
		}
		
		if(rev == temp) {
			System.out.println("its palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
