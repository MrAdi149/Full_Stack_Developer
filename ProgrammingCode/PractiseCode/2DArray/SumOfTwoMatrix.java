import java.util.Scanner;

public class SumOfTwoMatrix {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of row: ");
		int m = sc.nextInt();
		System.out.println("Enter the size of column: ");
		int n = sc.nextInt();
		
		int[][] arr = new int[m][n];
		
		System.out.println("Enter the first array elements: ");
		for(int i = 0; i<m; i++){
			for(int j = 0; j<n; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the second array elements: ");
		int[][] brr = new int[m][n];
		for(int i = 0; i<m; i++){
			for(int j = 0; j<n; j++){
				brr[i][j] = sc.nextInt();
			}
		}
		
		int[][] crr = new int[m][n];
		
		for(int i = 0; i<m; i++){
			for(int j = 0; j<n; j++){
				crr[i][j] = arr[i][j] + brr[i][j];
			}
		}
		
		System.out.println("after addition of two 2d array is: ");
		for(int i = 0; i<m; i++){
			for(int j = 0; j<n; j++){
				System.out.print(crr[i][j] + " ");
			}
			System.out.println();
		}
	}
}