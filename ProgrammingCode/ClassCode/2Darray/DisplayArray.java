class DisplayArray {
	
	public static void displayArray(int[][] arr){
		System.out.println("Created 2D array with these elements: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}