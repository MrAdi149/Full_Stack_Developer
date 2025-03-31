//distinct element between two array

import java.util.Scanner;

class DistinctElementFromTwoArray {
	
	public static void distinctElement(int[] arr, int[] brr){

		for(int i = 0; i<arr.length; i++){
			boolean flag = true;
			for(int j = 0; j<brr.length; j++){

				if(arr[i] == brr[j]){
					flag = false;
				}
			}
			if(flag == true){
				System.out.println(arr[i]);
			}
		}

		for(int i = 0; i<brr.length; i++){
			boolean flag = true;
			for(int j = 0; j<arr.length; j++){
				if(arr[j] == brr[i]){
					flag = false;
				}
			}
			if(flag == true){
				System.out.println(brr[i]);
			}
		}
	}
	
	public static void common(int[] arr,int[] brr){
		
		int n = arr.length;
		
		System.out.println("common element are: ");
		
		for(int i = 0; i<n; i++){
			if(arr[i] == brr[i]){
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of first element: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the size of second element: ");
		int x = sc.nextInt();
		int[] brr = new int[x];
		
		for(int i = 0; i<x; i++){
			brr[i] = sc.nextInt();
		}
		
		//common(arr,brr);
		distinctElement(arr, brr);
	}
}