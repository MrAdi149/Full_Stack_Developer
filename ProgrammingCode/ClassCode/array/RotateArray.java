import java.util.Scanner;

class RotateArray {
    
    Scanner sc = new Scanner(System.in);
    int[] arr;

    void inputArray() {
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        
        arr = new int[n];
        
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void rotate() {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        System.out.print("Rotated array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        ra.inputArray();

        while(true) {
            ra.rotate(); 
            System.out.print("Press '0' to exit or any other number key to rotate again: ");
            int input = ra.sc.nextInt();
            if (input == 0) {
                System.out.println("Exiting...");
                break; 
            }
        }
    }
}