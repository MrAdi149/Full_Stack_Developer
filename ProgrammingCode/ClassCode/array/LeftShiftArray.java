import java.util.Scanner;

class LeftShiftArray {
	
	public static void leftShift(int[] arr,int n){
		
		for(int j = 0; j<n; j++){
			int temp = arr[0];
			for(int i = 0; i<arr.length-1; i++){
				arr[i] = arr[i+1];
			}
			arr[arr.length-1] = temp;
		}
		
		System.out.println("left Array shift: ");
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
		
		int x = sc.nextInt();
		leftShift(arr,x);
	}
}