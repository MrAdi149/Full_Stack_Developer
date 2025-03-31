// arr = 10,20,30       brr=40,50,60,70,80
//crr = 10,40,20,50,30,60,70,80

import java.util.Scanner;

public class MergeTwoArray {

    public static void mergeTwoArray(int[] arr, int[] brr) {
        int[] result = new int[arr.length + brr.length];

        int i = 0, j = 0, k = 0;

        while(i<arr.length && j<brr.length){
			result[k++] = arr[i++];
			result[k++] = brr[j++];
		}
		
		while(i<arr.length){
			result[k++] = arr[i++];
		}
		
		while(j<brr.length){
			result[k++] = brr[j]++;
		}
		
		System.out.println("Merging of two array: ");
		for(int i = 0; i<result.length; i++){
			System.out.println(result[i]);
		}
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of the first array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the second array: ");
        int x = sc.nextInt();
        int[] brr = new int[x];

        System.out.println("Enter elements of the second array: ");
        for (int i = 0; i < x; i++) {
            brr[i] = sc.nextInt();
        }

        mergeTwoArray(arr, brr);
    }
}
