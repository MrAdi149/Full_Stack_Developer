import java.util.Scanner;

public class SumOfMatrix {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the row size: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the column size: ");
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		
		for(int i = 0; i<n; i++){
			for(int j = 0; j<m; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Sum of the matrix: ");
		int sum = 0;
		for(int i = 0; i<n; i++){
			for(int j = 0; j<m; j++){
				sum = sum + arr[i][j];
			}
			System.out.println();
		}
		
		System.out.println(sum);
	}
}
			