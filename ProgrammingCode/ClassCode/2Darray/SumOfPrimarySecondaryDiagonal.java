class SumOfPrimarySecondaryDiagonal{
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		sumOfDiagonal(arr);
	}
	
	public static void sumOfDiagonal(int[][] arr){
		
		int sum = 0; 
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				if(i == j || i+j == arr.length-1){
					sum = sum + arr[i][j];
				}
			}
		}
				
		System.out.println(sum);
	}
}