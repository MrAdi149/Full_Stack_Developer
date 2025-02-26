import java.util.Scanner;

class AddTwoNumbers {
    
    public static int[] addTwoNumbers(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] result = new int[n + 1];
        int carry = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            int sum = arr1[i] + arr2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }
        
        result[0] = carry;
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        
        int[] result = addTwoNumbers(arr1, arr2);
        
        // Printing the result array
        for (int i = 0; i < result.length; i++) {
            if (i == 0 && result[i] == 0) {
                // Skip leading zero if it exists
                continue;
            }
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
