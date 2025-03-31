import java.util.Scanner;

class BirthdayCakeCandle {
	
	public static int maxCandle(int[] arr){
		
		int fmax = arr[0];
		int count = 0;
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i] > fmax){
				fmax = arr[i];
			}
		}
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i] == fmax){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int result = maxCandle(arr);
		System.out.println(result);
	}
}