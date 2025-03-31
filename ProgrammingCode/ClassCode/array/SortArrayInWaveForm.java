import java.util.Scanner;

class SortArrayInWaveForm {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		sortArrayinWaveForm(arr);
		
		for(int num: arr){
			System.out.print(num + " ");
		}
	}
	
	public static void sortArrayinWaveForm(int[] arr){
		
		for(int i = 0; i< arr.length-1; i+=2){
			
			if(i > 0 && arr[i] <= arr[i-1]){
				swap(arr,i,i-1);
			}
			
			if(i<arr.length-1 && arr[i]<=arr[i+1]){
				swap(arr,i,i+1);
			}
		}
	}
	
	public static void swap(int[]arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
	