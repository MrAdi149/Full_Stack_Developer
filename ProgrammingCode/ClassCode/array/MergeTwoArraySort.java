//merge two array in sorted order

import java.util.Scanner;

class MergeTwoArraySort {
	
	public static void mergeSortArray(int[] arr, int[] brr){
		
		int[] mergeArray = new int[arr.length + brr.length];
		
		for(int i = 0; i<arr.length; i++){
			mergeArray[i] = arr[i];
		}
		
		for(int i = 0; i<brr.length; i++){
			mergeArray[arr.length + i] = brr[i];
		}
		
		System.out.println("sorting of elements: ");
        for (int i = 0; i < mergeArray.length - 1; i++) {
            for (int j = 0; j < mergeArray.length - 1 - i; j++) {
                if (mergeArray[j] > mergeArray[j + 1]) {
                    
                    int temp = mergeArray[j];
                    mergeArray[j] = mergeArray[j + 1];
                    mergeArray[j + 1] = temp;
                }
            }
        }
		
		for(int i = 0; i<mergeArray.length; i++){
			System.out.print(mergeArray[i] + " ");
		}
		
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of first array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of second array: ");
		int x = sc.nextInt();
		int[] brr = new int[x];
		for(int i = 0; i<x; i++){
			brr[i] = sc.nextInt();
		}
		
		mergeSortArray(arr,brr);
	}
}