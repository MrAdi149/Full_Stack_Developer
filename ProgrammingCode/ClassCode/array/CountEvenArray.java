import java.util.Scanner;

class CountEvenArray {
	
	static int countEven(int[] arr){
		int count = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] % 2 == 0){
				count++;
			}
		}
		return count;
	}
	
	static int countOdd(int[] arr){
		int count = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] % 2 != 0){
				count++;
			}
		}
		return count;
	}
	
	static int[] count(int[] arr){
		
		int oddCount = 0;
		int evenCount = 0;
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i] % 2 == 0){
				evenCount++;
			}else{
				oddCount++;
			}
		}
		
		int[] result = new int[2];
		result[0] = evenCount;
		result[1] = oddCount;
		
		return result;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int[] countArray = count(arr);
		
		int evenCount = countEven(arr);
		int oddCount = countOdd(arr);
		
		System.out.println("count for even is: " + evenCount + " count for odd is: "+ oddCount);
		System.out.println("count for even is: " + countArray[0] + " count for odd is: "+ countArray[1]);
	}
}