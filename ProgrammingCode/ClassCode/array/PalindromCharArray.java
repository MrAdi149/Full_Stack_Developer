import java.util.Scanner;

class PalindromCharArray {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean isPalindrome = false;
		
		char[] arr = new char[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.next().charAt(0);
		}
		
		int i = 0; 
		int j = arr.length-1;
		
		while(i<j){
			
			if(arr[i] == arr[j]){
				isPalindrome = true;
			}
			
			i++;
			j--;
		}
		
		if(isPalindrome == true){
			System.out.println("its palindrome");
		}else{
			System.out.println("not palindrome");
		}
	}
}