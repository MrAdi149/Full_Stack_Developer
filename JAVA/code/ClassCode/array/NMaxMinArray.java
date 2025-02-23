//store array in max min order
//[1st max,1st min,2nd max, 2nd min]

import java.util.Scanner;

class NMaxMinArray {
	
	public static void NMax(int[] arr, int n){
		
		int[] nMax = new int[n];
		int[] nMin = new int[n];
		
		int[] result = new int[2*n];
		
		for(int i = 0; i<n; i++){
			nMax[i] = Integer.MIN_VALUE;
		}
		
		for(int i = 0; i<n; i++){
			nMin[i] = Integer.MAX_VALUE;
		}
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<nMax.length; j++){
				if(arr[i] > nMax[j]){
					for(int k = n - 1; k>j; k--){
						nMax[k] = nMax[k-1];
					}
					
					nMax[j] = arr[i];
					break;
				}
			}
			
			for(int j = 0; j<nMin.length; j++){
				if(arr[i] <nMin[j]){
					for(int k = n - 1; k>j; k--){
						nMin[k] = nMin[k-1];
					}
					
					nMin[j] = arr[i];
					break;
				}
			}
		}
		
		for(int i = 0;i<n; i++){
			result[2*i] = nMax[i];
			result[2*i+1]=nMin[i];
		}
		
		System.out.println("array with first max,first min,second max,second min......."); 
		for(int i = 0; i<result.length; i++){
			System.out.print(result[i] +" " );
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
		
		NMax(arr,n);
	}
}