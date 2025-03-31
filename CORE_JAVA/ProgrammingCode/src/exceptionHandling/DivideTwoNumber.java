package exceptionHandling;

import java.util.Scanner;

public class DivideTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		int c;
		
		try {
			 c = a / b;
			 System.out.println("Answer from divided by two number is: " + c);
		}catch(ArithmeticException e) {
			System.out.print("check the a and b value");
		}
	}

}
