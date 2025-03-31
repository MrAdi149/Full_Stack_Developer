//wajp to reverse the diagonal element

class ReverseDiagonalElement {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		reverseDiagonally(arr);
		
	}
	
	public static void reverseDiagonally(int[][] arr){
		
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
		
		
		DisplayArray.displayArray(arr);		
		
	}
}