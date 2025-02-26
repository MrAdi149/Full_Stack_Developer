//wajp to find the missing elements in array

//ex: 11,12,13,15,16 missing element is 14

import java.util.Scanner;

class MissingArray {
	
	public static int missingArray(int[] arr){
		
		int sumOfArray = 0;
		int sumOfRange = 0;
		
		for(int i = arr[0]; i<=arr[arr.length-1]; i++){
			sumOfRange = sumOfRange + i;
		}
		
		for(int j = 0; j<arr.length; j++){
			sumOfArray = sumOfArray + arr[j];
		}
		
		return sumOfRange - sumOfArray;
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