import java.util.Scanner;

class FactorialArray {

    static void factorial(int[] arr){
		for(int i = 0; i<arr.length; i++){
			
			int store = arr[i];
			int fact = 1; 
			
			for(int j = 1; j<=store; j++){
				fact = fact * j;
			}
			
			System.out.println("factorial for: " + store + " is: " + fact);
		}
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        factorial(arr);
    }
}