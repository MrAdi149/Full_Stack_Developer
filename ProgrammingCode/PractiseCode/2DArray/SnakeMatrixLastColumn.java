public class SnakeMatrixLastColumn {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		int[][] result = snakeMatrixLastColumn(arr);
		
		for(int i = 0; i < result.length; i++){
			for(int j = 0; j < result[i].length; j++){
				System.out.print(result[i][j] + " ");
			}
		}
	}
	
	public static int[][] snakeMatrixLastColumn(int[][] arr){
		
		int[][] result = new int[arr.length][arr[0].length];
		
		for(int i = 0; i < arr.length; i++){
			if( i % 2 != 0){
				for(int j = 0; j < arr[i].length; j++){
					result[i][j] = arr[i][j];
				}
			}else{
				for(int j = 0; j < arr[i].length; j++){
					result[i][j] = arr[i][arr[i].length-1-j];
				}
			}
		}
		
		return result;
	}
}