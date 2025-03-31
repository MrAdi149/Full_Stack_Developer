import java.util.Scanner;

class NMaxMinArray {
	
	public static void NMax(int[] arr, int n){
		
		if(n<1 || n>arr.length){
			System.out.println("not valid number");
		}else{
			for(int i = 1; i<=n; i++){
				int max = arr[0];
				for(int j = 0; j<arr.length; j++){
					if(arr[j] > max){
						max = arr[j];
					}
				}

				for(int k = 0; k<arr.length; k++){
					if(arr[k] == max){
						arr[k] = 0;
						break;
					}
				}
			}
		}	
	}
				
	public static void Nmin(int[] arr, int n){
		
		if(n<1 || n>arr.length){
			System.out.println("not valid number");
		}else{
			for(int i = 1; i<=n; i++){
				int min = arr[0];
				for(int j = 0; j<arr.length; j++){
					if(arr[j] < min){
						min = arr[j];
					}
				}

				for(int k = 0; k<arr.length; k++){
					if(arr[k] == min){
						arr[k] = Integer.MAX_VALUE;
						break;
					}
				}
			}
		}	
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements in array: ");
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		NMax(arr, n);
	}
}