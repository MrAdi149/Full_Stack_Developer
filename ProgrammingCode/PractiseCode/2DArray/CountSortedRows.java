public class CountSortedRows {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		int rowCount = countIncRow(arr) + countDecCol(arr);
		
		System.out.println("count: " + rowCount);
	}
	
	public static int countIncRow(int[][] arr){
		int count = 0;
		
		for(int i = 0; i<arr.length; i++){
			boolean isSorted = true;
			for(int j = 0; j<arr[i].length-1; j++){
				if(arr[i][j]>arr[i][j+1]){
					isSorted = false;
					break;
				}
			}
			
			if(isSorted){
				count++;
			}
		}
		
		return count;
	}
	
	public static int countDecCol(int[][] arr){
		int count = 0;
		for(int i = 0; i<arr.length; i++){
			boolean isSorted = true;
			for(int j = 0; j<arr[i].length-1; j++){
				if(arr[i][j] < arr[i][j+1]){
					isSorted = false;
					break;
				}
			}
			if(isSorted){
				count++;
			}
		}
		
		return count;
	}
}