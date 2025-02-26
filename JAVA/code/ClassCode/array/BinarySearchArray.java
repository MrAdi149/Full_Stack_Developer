import java.util.Scanner;

class BinarySearchArray {
    
    public static boolean binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (arr[mid] == target) {
                return true;
            }
            
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the element to search: ");
        int target = sc.nextInt();
        
        boolean result = binarySearch(arr, target, 0, n - 1);
        
        if (result) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
