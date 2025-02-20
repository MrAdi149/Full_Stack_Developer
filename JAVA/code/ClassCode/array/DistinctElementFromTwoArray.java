//distinct element between two array

import java.util.Scanner;

class DistinctElementFromTwoArray {
	
	public static void commonElement(int[] arr, int[] brr){
		
		int[] mergeArray = new int[arr.length+brr.length];
		
		for(int i = 0; i<arr.length; i++){
			mergeArray[i] = arr[i];
		}
		
		for(int i = 0; i<brr.length; i++){
			mergeArray[arr.length+i] = brr[i];
		}
		
		System.out.println("distinct element is: ");
		
		for (int i = 0; i < mergeArray.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < mergeArray.length; j++) {
                if (i != j && mergeArray[i] == mergeArray[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                System.out.print(mergeArray[i] + " ");
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
		
		commonElement(arr,brr);
		//common(arr,brr);
	}
}