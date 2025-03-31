public class ReverseColumnWise {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		reverseColumnWise(arr);
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] reverseColumnWise(int[][] arr){
		for(int j = 0; j<arr[0].length; j++){
			int start = 0;
			int end = arr[0].length-1;
			
			while(start < end){
				int temp = arr[start][j];
				arr[start][j] = arr[end][j];
				arr[end][j] = temp;
				start++;
				end--;
			}
		}
		return arr;
	}
}