import java.util.Scanner;

class MiniMaxSum {
	
	public static int[] minMaxSum(int[] arr){
		
		int maxSum = 0;
		int minSum = 0;
		
		int[] min = new int[arr.length];
		int[] max = new int[arr.length];
		
		for(int i = 0; i<arr.length; i++){
			min[i] = Integer.MAX_VALUE;
		}
		
		for(int i = 0; i<arr.length; i++){
			max[i] = Integer.MIN_VALUE;
		}
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr.length; i++){
				if(arr[i] > max[j]){
					for(int k = arr.length-1; k>j; k--){
						max[k] = max[k-1];
					}
					
					max[j] = arr[i];
					break;
				}
			}
			
			for(int j = 1; j<arr.length; j++){
				if(arr[j] < min[j]){
					for(int k = arr.length-1; k>j; k--){
						min[k] = min[k-1];
					}
					
					min[j] = arr[i];
					break;
				}
			}
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int[] result = minMaxSum(arr);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
}