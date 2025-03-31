public class ReverseDiagonalWise {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
					
		int start = 0; 
		int end = arr.length-1;
			
		while(start < end){
			int temp1 = arr[start][start];
			arr[start][start] = arr[end][end];
			arr[end][end] = temp1;
			
			int temp = arr[start][end];
			arr[start][end] = arr[end][start];
			arr[end][start] = temp;
			start++;
			end--;
		}
			
		
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}