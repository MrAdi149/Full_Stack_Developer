//wajp to transpose the given matrix
//1 2 3      1 4 7
//4 5 6  ->  2 5 8
//7 8 9      3 6 9

class TransposeMatrix {
	
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
		
		DisplayArray.displayArray(transposed);
	}
}
					