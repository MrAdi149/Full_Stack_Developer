//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.

import java.util.Scanner;

class TwoMedianSortedArray {
	
	public static void medianOfTwoArray(int[] nums1, int[] nums2){
		int values = nums1.length + nums2.length;
		
		int[] mergeArray = new int[values];
		
		for(int i = 0; i<nums1.length; i++){
			mergeArray[i] = nums1[i];
		}
		
		for(int i = 0; i<nums2.length; i++){
			mergeArray[nums1.length+i] = nums2[i];
		}
		
		System.out.println("before merging elements are: ");
		for(int i = 0; i<values; i++){
			System.out.print(mergeArray[i] + " ");
		}
		System.out.println();
		
		System.out.println("sorting of elements: ");
        for (int i = 0; i < mergeArray.length - 1; i++) {
            for (int j = 0; j < mergeArray.length - 1 - i; j++) {
                if (mergeArray[j] > mergeArray[j + 1]) {
                    
                    int temp = mergeArray[j];
                    mergeArray[j] = mergeArray[j + 1];
                    mergeArray[j + 1] = temp;
                }
            }
        }
		
		
		
		System.out.println("after merging elements are: ");
		for(int i = 0; i<values; i++){
			System.out.print(mergeArray[i] + " ");
		}
		
		System.out.println("median of two array is:  ");
		for(int i = 0; i<values; i++){
			if(mergeArray.length%2 != 0){
				System.out.println(mergeArray[mergeArray.length/2]);
				break;
			}
		}
	}
	
	public static double AverageOfTwoArrays(int[] nums1, int[] nums2) {

        double sum = 0;
        double add = 0;
        double totalSum = 0;

        for(int i =0; i<nums1.length; i++){
            sum = sum + nums1[i];
        }

        for(int i = 0; i<nums2.length; i++){
            add = add + nums2[i];
        }

        totalSum = add + sum;

        return totalSum/(nums1.length+nums2.length);
    }
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		int[] brr = new int[x];
		
		for(int i = 0; i<brr.length; i++){
			brr[i] = sc.nextInt();
		}
		
		System.out.println("average of two arrays: " + AverageOfTwoArrays(arr,brr));
		medianOfTwoArray(arr,brr);
	}
}