import java.util.Scanner;

class CreateArray {
	
	public static int[][] createArray(){
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the size of row: ");
		int row = sc.nextInt();
		
		System.out.println("Enter the size of column: ");
		int col = sc.nextInt();
		
		int[][] arr = new int[row][col];
		
		for (int i = 0; i < arr.length; i++) {
			int val = i+1;
			System.out.println("Enter the element for " + val + " row"); 
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		return arr;
		
	}
}