import java.util.Scanner;

class BetweenTwoSets {
	
	public static void lcm(int[] arr){
		for(int i = 0; i<arr.length;i++){
			int n = arr[i];
			int gcd = n;
			for(int j = 1; j<=n; j++){
				if(gcd%j==0){
					System.out.println(j);
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of first array: ");
		int n = sc.nextInt();
		System.out.println("enter the element in the array: ");
		int[] arr1 = new int[n];
		for(int i = 0; i<n; i++){
			arr1[i] = sc.nextInt();
		}
		lcm(arr1);
		System.out.println("enter the size of second array: ");
		int x = sc.nextInt();
		System.out.println("enter the element in the array: ");
		int[] arr2 = new int[n];
		
	}
}