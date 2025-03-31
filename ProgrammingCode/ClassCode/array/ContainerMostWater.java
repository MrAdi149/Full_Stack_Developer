import java.util.Scanner;

class ContainerMostWater {
	
	public static void maxArea(int[] arr){
		
		int fmax = arr[0];
		int ffmax = arr[0];
		
		for(int i = 1; i<arr.length; i++){
			if(arr[i] > fmax){
				fmax = arr[i];
			}
		}
		
		int smax = arr[1]; 
		
		for(int i = 1; i<arr.length; i++){
			if(arr[i] > ffmax){
				smax = ffmax;
				ffmax = arr[i];
			}
		}
		System.out.println("second max element in array is: " + smax);
		System.out.println("first max element in array is: " + fmax);
		
		System.out.println((fmax-1) * smax);
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		maxArea(arr);
		
	}
}