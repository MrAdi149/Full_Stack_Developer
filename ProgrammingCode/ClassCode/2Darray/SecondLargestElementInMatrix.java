//find the largest element

class SecondLargestElementInMatrix {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		CreateArray.displayArray(arr);
		
		int fmax = arr[0][0];
		int smax = arr[0][1];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] >= smax){
					smax = fmax;
					fmax = arr[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println(smax);
		
		DisplayArray.displayArray(arr);
	}
}