class SwapFirstLastColumn {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		swapFirstLastColumn(arr);
	}
	
	public static void swapFirstLastColumn(int[][] arr){
		
		int col1 = 0;
		int col2 = arr[0].length-1;
		
		for(int i = 0; i<arr.length; i++){
			int temp = arr[i][col1];
			arr[i][col1] = arr[i][col2];
			arr[i][col2] = temp;
		}
		
		DisplayArray.displayArray(arr);
	}
}