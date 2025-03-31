import java.util.Scanner;

class SumOfMatrix {
	
	public static void main(String[] args){
		
		int sum = 0;
		
		int[][] arr = CreateArray.createArray();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
		}
		
		System.out.println("sum of the matrix is: " + sum);
		
	}
	
}