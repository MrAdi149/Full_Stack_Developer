//wajp to find the count of even and odd number

class CountEvenOdd {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		countEO(arr);
	}
	
	public static void countEO(int[][] arr){
		
		int countEven = 0;
		int countOdd = 0;
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				
				if(arr[i][j] % 2 == 0){
					countEven++;
				}else{
					countOdd++;
				}
			}
		}
		
		System.out.println("Even Count is: "+countEven);
		System.out.println("Odd Count is: "+countOdd);
	}
}
		