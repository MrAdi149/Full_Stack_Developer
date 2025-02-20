//wajp to find frequency of each element present in array

import java.util.Scanner;

class FrequencyOfElement {
	
	public static void frequency(int[] arr){
		for(int i = 0; i<arr.length; i++){
			int count = 0;
			for(int j = i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
					arr[j] = 0;
				}
			}
			if(arr[i] != 0){
				System.out.println(arr[i] + " present " + count + " times in array");
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
		
		frequency(arr);
	}
}