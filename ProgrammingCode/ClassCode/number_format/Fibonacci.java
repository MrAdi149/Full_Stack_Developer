//wajp to write the fibonnaci number

import java.util.Scanner;

class Fibonacci {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		
		System.out.print(num1 + " " + num2);
		int sum = 0;
		
		for(int i = 3; i<=n; i++){
			sum = num1 + num2;
			System.out.print(" " + sum);
			num1 = num2;
			num2 = sum;
		}
		System.out.println();
		
		
		
		if(n == 1){
			System.out.println("the " + n + "th fibonnaci series is: "+ num1);
		}else if(n == 2){
			System.out.println("the " + n + "th fibonnaci series is: "+ num2);
		}else{
			System.out.println("the " + n + "th fibonnaci series is: "+ sum);
		}
	}
}