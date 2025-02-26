import java.util.Scanner;

class MonotonicArray {

    public static void monotonic(int[] arr) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                decreasing = false;
            }
            if (arr[i] < arr[i - 1]) {
                increasing = false;
            }
        }

        if (increasing || decreasing) {
            System.out.println("monotonic array");
        } else {
            System.out.println("not monotonic array");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        monotonic(arr);
    }
}
