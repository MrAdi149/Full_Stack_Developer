class ReverseArray {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		reverseRowWiseArray(arr);
	}
	
	public static void reverseRowWiseNewArray(int[][] arr){
		int[][] result = new int[arr.length][arr[0].length];
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				result[i][j] = arr[arr.length-i-1][arr[i].length-j-1];
				result[i][j] = arr[i][arr[i].length-j-1];
			}
		 }
	}
	
	public static void reverseRowWiseArray(int[][] arr){
		
		for(int i = 0; i<arr.length; i++){
			int start = 0; 
			int end = arr.length-1;
			
			while(start < end){
				int temp = arr[i][end];
				arr[i][end] = arr[i][start];
				arr[i][start] = temp;
				start++;
				end--;
			}
		}
		
		DisplayArray.displayArray(arr);
	}
	
	public static void reverseColumnWiseArray(int[][] arr){
		
		for(int j = 0; j<arr.length; j++){
			
			int start = 0;
			int end = arr.length-1;
			
			while(start < end){
				
				int temp = arr[start][j];
				arr[start][j] = arr[end][j];
				arr[end][j] = temp;
				start++;
				end--;
			}
		}
		
		System.out.println("column wise: ");
		DisplayArray.displayArray(arr);
	}
	
	
}