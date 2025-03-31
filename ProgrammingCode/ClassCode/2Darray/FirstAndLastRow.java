//Write a java program to print first and last row of an array

class FirstAndLastRow {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		firstAndLastRow(arr);
	}
	
	public static void firstAndLastRow(int[][] arr){
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				if(i==0 || j == arr[i].length-1){
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}
	}
}