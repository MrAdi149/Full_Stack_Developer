class LargestMaxValueColumnWise {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		largestMaxValueColumnWise(arr);
	}
	
	public static void largestMaxValueColumnWise(int[][] arr){
		
		for(int j = 0; j < arr[0].length; j++){
			int max = arr[0][j]; 
			
			for(int i = 0; i < arr.length; i++){
				if(arr[i][j] > max){
					max = arr[i][j]; 
				}
			}
			
			System.out.println("Max value in column " + j + " is: " + max);
		}
	}
	
}