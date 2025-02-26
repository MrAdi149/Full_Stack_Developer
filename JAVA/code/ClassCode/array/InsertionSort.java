import java.util.Scanner;

class InsertionSort {
	

	
	public static void insertionSort(int[] arr, int insertElement){
		
		int currentSize = arr.length;
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i] < insertElement && insertElement>arr[i+1]){
				arr[i+1] = insertElement;
				currentSize++;
			}
		}
		
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
				
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int insert = sc.nextInt();
		int pos = sc.nextInt();
		
		insertElement(arr,insert,pos);
	}
}