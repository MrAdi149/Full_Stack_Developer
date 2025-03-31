package com.adirajput;

//wajp to check wheather the given number is prime palindrome or not

import java.util.Scanner;

class PrimePalindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		int count = 0;
		int i = 2;
		while(i<=n/2) {
			if(n%i==0) {
				count++;
				break;
			}
			
			i++;
		}
		if(count == 0) {
			for(; n!=0; n = n / 10) {
				int lastDigit = n % 10;
				rev = rev * 10 + lastDigit;
			}
			if(rev == temp) {
				System.out.println("prime palindrom");
			}else {
				System.out.println("not prime palindrome");
			}
		}else {
			System.out.println("not prime number");
		}
	}
}
		