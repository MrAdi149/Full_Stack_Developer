//wajp to sum of two matrinx and store in other matrix

class SumOfTwoMatrix{
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		int[][] brr = CreateArray.createArray();
		
		sumOfMatrix(arr,brr);
	}
	
	public static void sumOfMatrix(int[][] arr, int[][] brr){
		
		if(arr.length == brr.length && arr[0].length == brr[0].length){
			int row = arr.length;
			int col = arr[0].length;
		
			int[][] result = new int[row][col];
		
			for(int i = 0; i<arr.length; i++){
				for(int j = 0; j<arr[i].length; j++){
				
					result[i][j] = arr[i][j] + brr[i][j];
				}
			}
			DisplayArray.displayArray(result);
		}else{
			System.out.println("addition is not possible of different size");
		}
	}
}