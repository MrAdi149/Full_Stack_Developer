//wajp to split the array into two equal half

import java.util.Scanner;

class DivideHalfArray {
	
	public static void split(int[] ar, int n){
		if(n%2 == 0){
			
			int value = ar.length/2;
			int[] br = new int[value];
			int[] cr = new int[value];
			
			for(int i = 0; i<ar.length; i++){
				if(i<value){
					br[i] = ar[i];
				}else{
					cr[i-value] = ar[i];
				}
			}
			System.out.println("first half");
			for(int i = 0; i<ar.length; i++){
				System.out.println(br[i]);
			}
			System.out.println("Second half");
			for(int i = 0; i<cr.length; i++){
				System.out.println(cr[i]);
			}
		}else{
			System.out.println("not possible");
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		split(arr,n);
	}
}