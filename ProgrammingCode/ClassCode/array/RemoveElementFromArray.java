import java.util.Scanner;

class RemoveElementFromArray {
	
	public static void isRemove(int[] arr, int elemenToRemove){
		
		int indexElemenToRemove = -1;
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i] == elemenToRemove){
				indexElemenToRemove = i;
				break;
			}
		}
		
		if(indexElemenToRemove != -1){
			int[] newArr = new int[arr.length - 1];
			
			for(int i = 0; i<indexElemenToRemove; i++){
				newArr[i] = arr[i];
			}
			for(int i = indexElemenToRemove + 1; i<arr.length; i++){
				newArr[i-1] = arr[i];
			}
			
			for(int i = 0; i<newArr.length; i++){
				System.out.println(newArr[i]);
			}
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the array: ");
		for(int i = 0; i<n; i++){
			
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("enter the element to remove: ");
		int elemenToRemove = sc.nextInt();
		isRemove(arr,elemenToRemove);
	}
}