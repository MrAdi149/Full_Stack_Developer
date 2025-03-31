import java.util.Scanner;

class SecondMinArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			
			arr[i] = sc.nextInt();
			
		}
		
		int fmin = arr[0];
		int smin = arr[1];
		
		for(int i = 1; i<arr.length; i++){
			if(arr[i] < fmin){
				smin = fmin;
				fmin = arr[i];
			}
		}
		
		System.out.println("second min element: " + smin);
	}
}