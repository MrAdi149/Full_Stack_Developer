package exceptionHandling;

import java.util.Scanner;

public class CustomException {
	
	public static void validateAge(int age) {
		if(age<0) {
			throw new InvalidAgeException("enter a valid age");
		}else {
			System.out.println("welcome");
		}
	}
	
	public static double squareRoot(double num) {
		return num*num;
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			validateAge(-21);
		}catch(InvalidAgeException inv) {
			System.out.println("exception caught: " + inv.getMessage());
		}
		
		double num = sc.nextDouble();
		
		if(num<0) {
			try{
				NegativeNumberException neg = new NegativeNumberException("exception in try block");
				throw neg;
			}catch(NegativeNumberException neg) {
				System.out.println("exception handled in catch block "+neg.getMessage());
			}
		}else {
			double squareRoot = squareRoot(num);
			System.out.println(squareRoot);
		}
	}

}
