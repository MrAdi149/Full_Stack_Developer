import java.util.Scanner;

class SumFirstLastArrayElement {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int sum = arr[0] + arr[n-1];
		System.out.print("sum of first and last element is: " + sum);
	}
}