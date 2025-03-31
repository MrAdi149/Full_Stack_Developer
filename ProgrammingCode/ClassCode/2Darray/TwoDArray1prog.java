import java.util.Scanner;

class TwoDArray1prog {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = CreateArray.createArray();
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}