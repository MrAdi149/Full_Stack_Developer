//Write a java program to print first ,last row of an array and first , last column of an array

class FirstRowLastColumn {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		firstRowLastColumn(arr);
	}
	
	public static void firstRowLastColumn(int[][] arr){
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				if(i==0||j==0||j==arr[i].length-1||i==arr.length-1){
					System.out.print(arr[i][j] + " ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
