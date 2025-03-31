import java.util.Scanner;

public class RightShiftNArray {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		frequency(arr);
	}
	
	public static void leftShiftNArray(int[] arr, int n){
		
		if(n<arr.length){
			n = n % arr.length;
		}
    for (int i = 0; i < n; i++) {
        int temp = arr[0]; 
        for (int j = 1; j <  arr.length; j++) {
            arr[j - 1] = arr[j];
        }
        arr[ arr.length - 1] = temp; 
    }
		System.out.println("-------------");
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void frequency(int[] arr){

		for(int i = 0; i<arr.length; i++){
		    
		    		
		    if(arr[i] == -1){
			    continue;
		    }
		
		    int count = 1;
			
			for(int j = i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
					arr[j] = -1;
				}
			}
			System.out.println(arr[i] + " " + count);
		}
	}
	
	public static void rightShiftNArray(int[] arr, int n){
		
		if(n<arr.length){
			n = n % arr.length;
		}
			
			for(int i = 0; i<n; i++){	
				int temp = arr[arr.length-1];
				for(int j = arr.length-2; j>=0; j--){
					arr[j+1]=arr[j];
					
				}
				arr[0] = temp;
			}
			
			
		System.out.println("---------");
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}