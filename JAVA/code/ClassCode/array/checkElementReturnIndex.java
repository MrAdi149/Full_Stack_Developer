import java.util.Scanner;

class checkElementReturnIndex {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int searchElement = sc.nextInt();
		
		for(int i = 0; i<n; i++){
			if(arr[i] == searchElement){
				System.out.println("element found at position: " + i);
			}
		}
	}
}