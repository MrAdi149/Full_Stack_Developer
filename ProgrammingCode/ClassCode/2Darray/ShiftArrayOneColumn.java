//Write a java program to shift the array one column left

class ShiftArrayOneColumn {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		shiftArray(arr);
	}
	
	public static void shiftArray(int[][] arr){
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length-1; j++){
				int temp = arr[i][j];
				arr[i][j] = arr[i][j+1];
				arr[i][j+1] = temp;
			}
		}
		
		DisplayArray.displayArray(arr);
	}
}