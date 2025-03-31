class Rotate90degreeMatrix {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		transposeMatrix(arr);
	}
	
	public static void transposeMatrix(int[][] arr) {
        int rows = arr.length;
		int cols = arr[0].length;
        int[][] transposed = new int[cols][rows];
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
		reverseRowWiseArray(transposed);
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
}
					