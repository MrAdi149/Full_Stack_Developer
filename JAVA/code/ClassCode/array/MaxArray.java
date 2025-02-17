import java.util.Scanner;

class MaxArray {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.print("Enter the element: ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int last = arr[arr.length-1];
		int max = 0;
		
		for(int i = 0; i<arr.length-1; i++){
			if(arr[i] < arr[i+1]){
				max = arr[i];
			}
		}
		
		System.out.println("Maximum element of array: " + max);
	}
}