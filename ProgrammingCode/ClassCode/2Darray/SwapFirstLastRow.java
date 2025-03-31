//Write a java program to swap first row with last row

class SwapFirstLastRow {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		swapFirstLastRow(arr);
	}
	
	public static void swapFirstLastRow(int[][] arr){
		
		int row1 = 0;
		int row2 = arr.length-1;
		
		for(int j = 0; j<arr[0].length; j++){
			int temp = arr[row1][j];
			arr[row1][j] = arr[row2][j];
			arr[row2][j] = temp;
		}
		
		
		DisplayArray.displayArray(arr);
	}
}