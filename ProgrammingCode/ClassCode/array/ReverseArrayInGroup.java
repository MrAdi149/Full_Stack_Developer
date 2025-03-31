import java.util.Scanner;

class ReverseArrayInGroup {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Reverse Array In Group: ");
		int k = sc.nextInt();
		
		reverseArrayInGroup(arr,k);
		
		for(int nums: arr){
			System.out.print(nums + " ");
		}
	}
	
	public static void reverseArrayInGroup(int[] arr, int k){
		
		for(int i = 0; i<arr.length; i+=k){
			int start = i;
			int end;
		
			if(i + k - 1 < arr.length){
				end = i + k - 1;
			}else{
				end = arr.length - 1;
			}
		
			while(start < end){
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
	}
}