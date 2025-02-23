import java.util.Scanner;

class CompareOfTriplets {
	
	public static int[] compareTriplet(int[] arr, int[] brr) {
		
		int scoreA = 0;
		int scoreB = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > brr[i]) {
				scoreA++;
			} else if(arr[i] < brr[i]) {
				scoreB++;
			}
		}
		
		int[] result = new int[2];
		result[0] = scoreA;
		result[1] = scoreB;
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the arrays: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int[] brr = new int[n];
		
		System.out.println("Create the first array: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Create the second array: ");
		for(int i = 0; i < n; i++) {
			brr[i] = sc.nextInt();
		}
		
		int[] result = compareTriplet(arr, brr);
		
		System.out.println("Score of A: " + result[0] + ", Score of B: " + result[1]);
	}
}