//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.Scanner;

class TwoSum {
	
	public static void twoSum(int[] arr, int target){
		
		for(int i = 0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				if(target == arr[i] + arr[j]){
					System.out.println("two elements are: " + i + " " + j);
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
		
		System.out.print("target of two sum: " );
		int target = sc.nextInt();
		
		twoSum(arr,target);
	}
}