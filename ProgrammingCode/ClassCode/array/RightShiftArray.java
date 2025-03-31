//wajp to right shift the elements in array

import java.util.Scanner;

class RightShiftArray {
	
	 public static void rightShift(int[] arr) {
        int[] result = new int[arr.length];
        
        result[0] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            result[i] = arr[i - 1];
        }
        
		System.out.println("right shift of array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		rightShift(arr);
	}
}