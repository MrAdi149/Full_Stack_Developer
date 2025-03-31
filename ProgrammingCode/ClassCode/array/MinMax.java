//wajp to arrang the array in max min order
//ex: 1 23 65 12 5 90
//ans 90 1 65 5 23 12

import java.util.Scanner;

class MinMax {
	
	public static void sort(int[] arr){
		BubbleSort.bubbleSort(arr);
		System.out.println();
		
		int start = 0;
		int minCount = 0;
		int maxCount = 0;
		int end = arr.length - 1;
		int []result = new int[arr.length];
		
		for(int i = 0; i<arr.length; i++){
			
			if(i%2 == 0){
				result[i] = arr[end--];
				minCount++;
			}else{
				result[i] = arr[start++];
				maxCount++;
			}
			
		}
		
		for(int i = 0; i<result.length; i++){
			System.out.print(result[i] + " ");
		}
		System.out.println();
		System.out.println(minCount);
		System.out.println(maxCount);
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		sort(arr);
	}
}