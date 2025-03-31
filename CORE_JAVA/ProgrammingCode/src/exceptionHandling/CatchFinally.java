package exceptionHandling;

import java.util.Scanner;

public class CatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		try {
			int c = a / b;
			System.out.println("result of division is: " + c);
		}catch(ArithmeticException e) {
			System.out.println("can not divided by 0");
		}
		
		finally {
			 System.out.println("finally block executed");
		}

	}

}
