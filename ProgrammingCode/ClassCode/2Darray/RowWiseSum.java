class RowWiseSum {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		sumRow(arr);
		
	}
	
	public static void sumRow(int[][] arr){
		
		for(int i = 0; i<arr.length; i++){
			int sum = 0;
			for(int j = 0; j<arr[i].length; j++){
				sum = sum + arr[i][j];
			}
			
			System.out.println(sum);
		}
	}
	
}
	