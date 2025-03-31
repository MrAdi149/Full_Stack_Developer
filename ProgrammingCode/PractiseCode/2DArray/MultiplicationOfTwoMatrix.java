public class MultiplicationOfTwoMatrix {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		int[][] brr = CreateArray.createArray();
		
		multiplication(arr,brr);
	}


	public static void multiplication(int[][] arr, int[][] brr){
		
		int[][] crr = new int[arr.length][brr[0].length];
		
		
		if(arr[0].length == brr.length){
			for(int i = 0; i<arr.length; i++){
				for(int j = 0; j<brr[0].length; j++){
					int sum = 0;
					for(int k = 0; k<arr[0].length; k++){
						sum = sum + arr[i][k] * brr[k][j];
					}
					crr[i][j] = sum;
				}
			}
		
			for(int i = 0; i<crr.length; i++){
				for(int j = 0; j<crr[i].length; j++){
					System.out.print(crr[i][j] + " ");
				}
				System.out.println();
			}
		}else{
			System.out.println("Not Possible");
		}
	}
	
}
	