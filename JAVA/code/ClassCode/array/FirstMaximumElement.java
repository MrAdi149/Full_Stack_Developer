import java.util.Scanner;

class FirstMaximumElement {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		int max = arr[0];
		
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i = 1; i<arr.length; i++){
			if(arr[i] >= max){
				max = arr[i];
			}
		}
		System.out.println("first element is: " + max);
	}
}