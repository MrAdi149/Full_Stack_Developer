//wajp to find the missing elements in array

//ex: 11,12,13,15,16 missing element is 14

import java.util.Scanner;

class MissingArray2 {
	
	public static void missingArray(int[] arr){
		
		int first = arr[0];
		int last = arr[arr.length-1];

		for(int i = first; i<=last; i++){
			boolean flag = false;
			for(int j = 0; j<arr.length; j++){
				if(arr[j] == i){
					flag = true;
					break;
				}
			}
			
			if(flag == false){
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		missingArray(arr);
		
	}
}