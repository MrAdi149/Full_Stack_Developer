//wajp to rotate anti-clockwise

class RotateAntiClockWise{
	
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
		reverseColumnWiseArray(transposed);
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