import java.util.Scanner;

class firstMinArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int firstMin = arr[0];
		
		for(int i = 1; i<arr.length; i++){
			
			if(arr[i] < firstMin){
				firstMin = arr[i];
			}
		}
		
		System.out.println("first min element of the array: " + firstMin);
	}
}