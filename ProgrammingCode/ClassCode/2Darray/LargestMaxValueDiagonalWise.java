class LargestMaxValueDiagonalWise {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		largestMaxValueDiagonalWise(arr);
	}
	
	public static void largestMaxValueDiagonalWise(int[][] arr){
		
		int max = 0;
		int max1 = 0;
		for(int i = 0; i<arr.length;i++){
			
			max = arr[i][0];
			
			for(int j = 0; j<arr[i].length; j++){
				if(i == j){
					if(arr[i][j] > max){
						max = arr[i][j];
					}
				}
				
				if(i+j == arr.length-1){
					if(arr[i][j] > max1){
						max1 = arr[i][j];
					}
				}
			}
			
			
		}
		System.out.println(max);
		System.out.println(max1);
	}
	
}