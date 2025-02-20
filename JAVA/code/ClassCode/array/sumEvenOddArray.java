import java.util.Scanner;

class sumEvenOddArray {

    public static int sumEvenArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
	
	public static int sumOddArray(int[] arr){
		int sum = 0;
		for(int i = 0; i<arr.length; i++){
			if(i%2 != 0){
				sum = sum + arr[i];
			}
		}
		return sum;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sumEven = sumEvenArray(arr);
        System.out.println("Sum of elements at even positions: " + sumEven);
		
		int sumOdd = sumOddArray(arr);
        System.out.println("Sum of elements at even positions: " + sumOdd);
    }
}
