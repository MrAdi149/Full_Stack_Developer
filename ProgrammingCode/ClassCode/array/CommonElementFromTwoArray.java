//common element between two array

import java.util.Scanner;

class CommonElementFromTwoArray {
	
	public static void commonElement(int[] arr, int[] brr){
		
		int[] mergeArray = new int[arr.length+brr.length];
		
		for(int i = 0; i<arr.length; i++){
			mergeArray[i] = arr[i];
		}
		
		for(int i = 0; i<brr.length; i++){
			mergeArray[arr.length+i] = brr[i];
		}
		
		System.out.println("common element is: ");
		
		for(int i = 0; i<mergeArray.length; i++){
			for(int j = i+1; j<mergeArray.length;j++){
				if(mergeArray[i] == mergeArray[j]){
					System.out.println(mergeArray[i]);
				}
			}
		}
	}
	
	public static void common(int[] arr,int[] brr){
		
		int n = arr.length;
		
		System.out.println("common element are: ");
		
		for(int i = 0; i<n; i++){
			for(int j = 0;j<brr.length; j++){
				if(arr[i] == brr[j]){
					System.out.println(arr[i]);
					break;
				}
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
		
		//commonElement(arr,brr);
		common(arr,brr);
	}
}