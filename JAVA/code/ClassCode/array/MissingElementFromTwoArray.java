import java.util.Scanner;

public class MissingElementFromTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of first array: ");
        int n = sc.nextInt();
        
        int[] arr1 = new int[n];
        System.out.println("Enter the elements of the first array: ");
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Enter the size of second array: ");
        int x = sc.nextInt();
        
        int[] arr2 = new int[x];
        System.out.println("Enter the elements of the second array: ");
        for(int i = 0; i < x; i++) {
            arr2[i] = sc.nextInt();
        }
        
        missing(arr1, arr2);
    }

    public static void missing(int[] arr1, int[] arr2) {
        int val1 = arr1.length;
        int val2 = arr2.length;
                
        System.out.println("\nMissing elements from the Second array: ");
        for(int i = 0; i < val1; i++) {
            boolean found = false;
            for(int j = 0; j < val2; j++) {
                if(arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
			if(found == false){
				System.out.println(arr1[i]);
			}
        }
		
		System.out.println("Missing elements from the first array: ");
		for(int i = 0; i<val2; i++){
			boolean found = false;
			for(int j = 0; j<val1; j++){
				if(arr2[i] == arr1[j]){
					found = true;
					break;
				}
			}
			
			if(found == false){
				System.out.println(arr2[i]);
			}
		}
    }
}
