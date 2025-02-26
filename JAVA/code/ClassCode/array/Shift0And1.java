//wajp to move all 0 to left and all 1 to right

import java.util.Scanner;

class Shift0And1 {
	
	public static void shift0and1(int[] arr){
		int left = 0; 
		int right = arr.length - 1;
		
		while(left < right){
			
			while(arr[left] == 0 && left < right){
				left++;
			}
			
			while(arr[right] == 1 && left < right){
				right--;
			}
			
			if(left<right){
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
		
		
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		shift0and1(arr);
	}
}