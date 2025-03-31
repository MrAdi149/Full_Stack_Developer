//wajp to find the missing elements in array

//ex: 11,12,13,15,16 missing element is 14

//wajp to find the missing elements in array

//ex: 11,12,13,15,16 missing element is 14

import java.util.Scanner;

class MissingArray2 {
	
	public static void missingArray(int[] arr){

		for(int i = arr[0]; i<=arr[arr.length-1]; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int result = missingArray(arr);
		System.out.println(result);
	}
}