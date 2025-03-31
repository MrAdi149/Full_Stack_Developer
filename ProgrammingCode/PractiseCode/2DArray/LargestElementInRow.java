public class LargestElementInRow {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		int m = arr.length;
		int n = arr[0].length;
		
		for(int i = 0; i<m; i++){
			int maxRow = arr[i][0];
			for(int j = 0; j<n; j++){
				if(arr[i][j]> maxRow){
					maxRow = arr[i][j];
				}
			}
			System.out.println("Maximum element in row is: " + maxRow);
		}
	}
}