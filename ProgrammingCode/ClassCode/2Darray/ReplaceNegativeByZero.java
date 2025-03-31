//Write a java program to replace all negative elements of an array by 0 (zero).

class ReplaceNegativeByZero {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		replaceNegativeByZero(arr);
	}
	
	public static void replaceNegativeByZero(int[][] arr){
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				if(arr[i][j]<0){
					arr[i][j] = 0;
				}
			}
		}
		
		DisplayArray.displayArray(arr);
	}
}