import java.util.Scanner;

class ArrayOperation {
	
	public static int[] readArray(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.print("enter the array values: ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static void displayArray(int[] arr){
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}