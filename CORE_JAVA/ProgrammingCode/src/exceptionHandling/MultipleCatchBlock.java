package exceptionHandling;

import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		try {
			for(int i = 0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			int [] result = new int[arr.length];
			
			System.out.println("Enter the value to divide: ");
			int divide = sc.nextInt();
			
			for(int i = 0; i<arr.length; i++) {
				try {
					result[i] = arr[i] / divide;
				}catch(ArithmeticException a) {
					System.out.println("number can not divide by 0");
					break;
				}
			}

			System.out.println("result after division: ");
			for(int j = 0; j<result.length; j++) {
				System.out.println(result[j]);
			}
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Check the size of array");
		}

	}

}
