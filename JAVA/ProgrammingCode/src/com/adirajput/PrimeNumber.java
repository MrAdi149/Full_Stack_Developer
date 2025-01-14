package com.adirajput;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i = 2; i<=n/2; i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println("it is a prime number");
		}else {
			System.out.println("it is not a prime number");
		}
		sc.close();
	}

}
