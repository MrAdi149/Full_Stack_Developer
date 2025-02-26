import java.util.Scanner;

class LinearSearchArray {
	
	public static void linearSearch(int[] arr, int target){
		
		boolean flag = false;
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i] == target){
				flag = true;
			}
		}
		
		if(flag == true){
			System.out.println("element is present");
		}else{
			System.out.println("element is not present");
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the element to search: ");
		int target = sc.nextInt();
		
		linearSearch(arr,target);
	}
}