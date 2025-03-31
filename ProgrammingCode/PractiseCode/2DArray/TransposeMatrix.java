public class TransposeMatrix {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		int[][] result = transposeMatrix(arr);
		
		for(int i = 0; i<result.length; i++){
			for(int j = 0; j<result[i].length; j++){
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static int[][] transposeMatrix(int[][] arr){
		
		int rows = arr.length;
		int cols = arr[0].length;
        int[][] result = new int[cols][rows];
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                result[j][i] = arr[i][j];
            }
        }
		
		return result;
	}
}
		
		