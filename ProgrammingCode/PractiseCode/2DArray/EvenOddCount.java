public class EvenOddCount {
	
	public static void main(String[] args){
		
		int[][] arr = CreateArray.createArray();
		
		int ecount = 0;
		int ocount = 0;
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				if(arr[i][j] % 2 == 0){
					ecount++;
				}else{
					ocount++;
				}
			}
		}
		
		System.out.println("Even Count is: " + ecount + " Odd count is: " + ocount);
	}
}