import java.util.Scanner;

class SecondMaxElement {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		int fmax = arr[0];
		int smax = arr[1];
		
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i = 1; i<arr.length; i++){
			if(arr[i] > fmax){
				smax = fmax;
				fmax = arr[i];
			}
		}
		
		System.out.println("second largest element: " + smax);
	}
}
		
		