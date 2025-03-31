//wajp to right shift the elements in array to n time

import java.util.Scanner;

class RightShiftNArray {
	
	 public static void rightShift(int[] arr, int n) {
        while(n%ar.length>0){
			int temp = arr[arr.length - 1];
			int j = arr.length - 2;
			while(j>=0){
				arr[j+1] = arr[j];
				j--;
			}
			arr[0] =temp;
			n--;
		}
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
    }
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("how many times you want to shift the array: ");
		int x = sc.nextInt();
		
		rightShift(arr,x);
		
		
	}
}