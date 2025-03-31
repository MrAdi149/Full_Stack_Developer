import java.util.Scanner;

class SumAvgArray {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []a = new int[n];
		
		int sum = 0;
		
		for(int i = 0; i<n; i++){
		System.out.print("Enter the " + i + " value of array: ");
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		double avg = sum;
		System.out.println("the sum of array is: " + sum + " and the avg is: " + avg/n);
	}
}