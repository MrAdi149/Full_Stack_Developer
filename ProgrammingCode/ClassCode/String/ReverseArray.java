class ReverseArray {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		reverseArray(arr);
	}
	
	public static void reverseArray(int[][] arr){
		
		int[][] result = new int[arr.length][arr[i].length];
		
		for(int i = 0; i<arr.length; i++){
			int j = 0; j<arr[i].length; j++){
				result[i][j] = arr[arr.length-i-1][arr[i].length-j-1];
			}
		}
		
		DisplayArray.displayArray(result);
	}
}