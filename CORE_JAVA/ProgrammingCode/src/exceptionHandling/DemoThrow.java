package exceptionHandling;

import java.util.Scanner;

public class DemoThrow extends ThrowsException {
	
	Scanner sc = new Scanner(System.in);

	@Override
	void NumberCounting() {
		for(int i = 1; i<=10; i++) {
			System.out.println(i/i);
		}
	}
	
	@Override
	void array() {
		System.out.println("enter the size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<=arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public static void main(String[] args) {
		DemoThrow dt = new DemoThrow();
		dt.NumberCounting();
		
		try {
			dt.array();
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("catch block executed");
		}
	}
}
