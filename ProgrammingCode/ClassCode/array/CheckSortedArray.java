import java.util.Scanner;

public class CheckSortedArray {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the elements in array: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		boolean result = isSorted(arr);
		
		System.out.println("the array is sorted: " + result);
	}
	
	public static boolean isSorted(int[] arr){
		
		for(int i = 0; i < arr.length-1; i++){
			if(arr[i] > arr[i+1]){
				return false;
			}
		}
		
		return true;
	}
}