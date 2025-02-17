import java.util.Scanner;

class ReverseArrayElement {
	
	static void reverse(int[] arr){
		
		for(int i = 0; i<arr.length; i++){
			
			int store = arr[i];
			
			int temp = store;
			
			int rev = 0;
			
			while(store != 0){
				
				int digit = store % 10;
				rev = rev * 10 + digit;
				store = store / 10;
				
			}
			
			System.out.println("array is: " + temp + " rev: " + rev);
		}
	}
	
	static int reverseArray(int n){
		int rev = 0;
		
		while(n!=0){
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		
		return rev;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("--------------------------------------");
		
		reverse(arr);
		
		System.out.println("--------------------------------------");
		
		for(int i = 0; i<arr.length; i++){
			
			arr[i] = reverseArray(arr[i]);
			
		}
		
		System.out.println("--------------------------------------");
		
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
	}
}
			