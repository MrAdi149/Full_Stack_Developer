import java.util.Scanner;

class BubbleSort {
	
	public static void bubbleSort(int[] arr){
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr.length; j++){
				
				if(arr[i] < arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		bubbleSort(arr);
	}
}