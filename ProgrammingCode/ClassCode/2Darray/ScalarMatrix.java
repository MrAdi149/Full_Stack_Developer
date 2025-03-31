class ScalarMatrix {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		scalarMatrix(arr);
		
		if(scalarMatrix(arr)){
			System.out.println("yes it is");
		}else{
			System.out.println("no it's not");
		}
	}
	
	public static boolean scalarMatrix(int[][] arr){
		
		int diagonalMat = arr[0][0];
		
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				if(i==j){
					if(arr[i][j] != diagonalMat){
						return false;
					}
				}else{
					if(arr[i][j] != 0){
						return false;
					}
				}
			}
		}
		return true;
	}
}