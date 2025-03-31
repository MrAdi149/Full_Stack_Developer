package exceptionHandling;

import java.util.Scanner;

public class ArithmeticHandling {
	
	public static int calculate(int a, int b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		try {
			a = sc.nextInt();
			b = sc.nextInt();
//			System.out.println(a/b);
			int calculate = calculate(a,b);
			System.out.println(calculate);
		}catch(ArithmeticException e) {
			System.out.println("can not divide by 0");
		}finally {
			System.out.println("operation completed");
		}
	}

}
