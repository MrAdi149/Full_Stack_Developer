import java.util.Scanner;

class CountPositiveNegativeZero {
	
	public static double[] countPositiveNegativeZero(int[] arr) {
		
		int countPo = 0; 
		int countNe = 0; 
		int count0 = 0;  
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				countPo++;
			} else if (arr[i] == 0) {
				count0++;
			} else {
				countNe++;
			}
		}
		
		double[] result = new double[3];
		result[0] = (double) countPo / arr.length; 
		result[1] = (double) count0 / arr.length; 
		result[2] = (double) countNe / arr.length; 
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		double[] result = countPositiveNegativeZero(arr);
		
		System.out.println("Ratio of positive numbers: " + result[0]);
		System.out.println("Ratio of zeros: " + result[1]);
		System.out.println("Ratio of negative numbers: " + result[2]);
	}
}