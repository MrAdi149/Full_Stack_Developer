import java.util.Scanner;

class PalindromeIntArray {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int [n];
		
		boolean flag = false;
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int i = 0; 
		int j = arr.length - 1;
		
		while(i<j){
			if(arr[i] == arr[j]){
				flag = true;
			}
			
			i++;
			j--;
		}
		
		if(flag == true){
			System.out.print("is palindrome");
		}else{
			System.out.print("not palindrome");
		}
	}
}