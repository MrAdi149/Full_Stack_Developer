import java.util.Scanner;

class MedianArray {
	
	public static void medianOfArray(int[] nums1){
		int values = nums1.length;
		
		int[] mergeArray = new int[values];
		
		for(int i = 0; i<nums1.length; i++){
			mergeArray[i] = nums1[i];
		}
		
		System.out.println();
		
		System.out.println("median of array is:  ");
		for(int i = 0; i<values; i++){
			if(mergeArray.length%2 != 0){
				System.out.println(mergeArray[mergeArray.length/2]);
				break;
			}else{
				System.out.println(mergeArray[mergeArray.length/2-1]+" "+mergeArray[mergeArray.length/2]);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i<n; i++){
			
			arr[i] = sc.nextInt();
			
		}
		
		medianOfArray(arr);
	}
}