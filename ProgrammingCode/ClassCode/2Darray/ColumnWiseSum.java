class ColumnWiseSum {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		sumColumn(arr);
		
	}
	
	public static void sumColumn(int[][] arr){
		
		for(int i = 0; i<arr[0].length; i++){
			int sum = 0;
			for(int j = 0; j<arr.length; j++){
				sum = sum + arr[j][i];
			}
			
			System.out.println(sum);
		}
	}
	
}
	