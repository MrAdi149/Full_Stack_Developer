public class LargestElementInColumnWise {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		for(int j = 0; j<arr[0].length; j++){
			int maxCol = arr[0][j];
			
			for(int i = 0; i<arr.length; i++){
				if(arr[i][j] > maxCol){
					maxCol = arr[i][j];
				}
			}
			
			System.out.println("Largest element column wise: " + maxCol);
		}
	}
}