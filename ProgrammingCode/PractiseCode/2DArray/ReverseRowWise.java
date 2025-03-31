public class ReverseRowWise {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		reverseRowWise(arr);
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	public static int[][] reverseRowWise(int[][] arr){
		
		for(int i = 0; i<arr.length; i++){
			int start = 0;
			int end = arr.length - 1;
			
			while(start < end){
				int temp = arr[i][start];
				arr[i][start] = arr[i][end];
				arr[i][end] = temp;
				start++;
				end--;
			}
		}
		return arr;
	}	
}