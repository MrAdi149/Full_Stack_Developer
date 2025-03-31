public class RotateLeft {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		int[][] result = TransposeMatrix.transposeMatrix(arr);
		
		ReverseColumnWise.reverseColumnWise(result);
		
		for(int i = 0; i<result.length; i++){
			for(int j = 0; j<result[i].length; j++){
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}