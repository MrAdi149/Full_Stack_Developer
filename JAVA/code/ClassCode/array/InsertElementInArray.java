//wajp to insert the element in given position in the array

import java.util.Scanner;

class InsertElementInArray {
	
	public static void insertElement(int[] arr, int pos, int ele){
		
		for(int i = arr.length - 1; i>pos; i--){
			arr[i] = arr[i-1];
		}
		
		arr[pos] = ele;
		
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the position for the array to enter element: ");
		int pos = sc.nextInt();
		int ele = sc.nextInt();
		
		pos = pos - 1;
		insertElement(arr,pos,ele);
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] +" ");
		}
	}
}