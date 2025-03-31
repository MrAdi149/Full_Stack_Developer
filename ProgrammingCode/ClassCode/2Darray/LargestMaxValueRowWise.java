class LargestMaxValueRowWise {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		largestMaxValueRowWise(arr);
	}
	
	public static void largestMaxValueRowWise(int[][] arr){
		
		
		for(int i = 0; i<arr.length;i++){
			
			int max = arr[i][0];
			
			for(int j = 0; j<arr[i].length; j++){
				if(arr[i][j]>max){
					max = arr[i][j];
				}
			}
			
			System.out.println(max);
		}
		
	}
	
}