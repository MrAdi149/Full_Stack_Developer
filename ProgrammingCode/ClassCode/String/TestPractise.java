import java.util.Scanner;

public class TestPractise
{
    
    public static void sortedArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
	
	public static void binarySearch(int[] arr, int target, int start, int end){
		
		while(start<end){
			
			int mid = (start + end) / 2;
			
			if(arr[mid] == target){
				System.out.println("found");
			}
			
			if(arr[mid] > target){
				end = mid - 1;
			}else{
				end = mid + 1;
			}
		}
	}
	
	public static void rightShiftNArray(int[] arr, int n){
			
			for(int j = 0; j<n; j++){
				int temp = arr.length-1;
				
				for(int i = arr.length-2; i>=0; i--){
					arr[i]=arr[i+1];
				}
				arr[0] = temp;
			}
		
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void removeElement(int[] arr, int index){
		
		int[] result = new int[arr.length-1];
		
		int i = 0; 
		int j = 0;
		
		while(i < arr.length){
			if(i != index){
				result[j++] = arr[i];
			}
			i++;
		}
		
		for(int k = 0; k<result.length; k++){
			System.out.println(result[k]);
		}
	}
	
	public static void distinctElement(int[]arr1, int[] arr2){
		int[] result = new int[arr1.length + arr2.length];
		
		
		for(int i = 0; i<arr1.length; i++){
			result[i] = arr1[i];
		}
		
		for(int j = 0; j<arr2.length; j++){
			result[arr1.length + j] = arr2[j];
		}
		
		for(int i = 0; i<result.length; i++){
			for(int j = 0; j<result.length; j++){
				if(result[i] != result[j]){
					System.out.println(result[i]);
				}
			}
		}
		
	}
		
	
	public static void frequency(int[] arr){

		for(int i = 0; i<arr.length; i++){
		    
		    		
		    if(arr[i] == -1){
			    continue;
		    }
		
		    int count = 1;
			
			for(int j = 1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
					arr[j] = -1;
				}
			}
			System.out.println(arr[i] + " " + count);
		}
	}
	
	public static void BubbleSort(int[] arr, int n){
		
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 0; j < arr.length-1-i; j++){
				if(arr[j] < arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void MaxMin(int[] arr){
		
		BubbleSort(arr);
		
		int start = 0;
		int end = arr.length-1;
		int[] result = new int[arr.length];
		
		for(int i = 0; i<arr.length; i++){
			if(i%2==0){
				result[i] = arr[end--];
			}
			else{
				result[i] = arr[start++];
			}
		}
		
		for(int i = 0; i<result.length; i++){
			System.out.print(result[i] + " ");
		}
	}
    
    public static void mergeArray(int[] arr1, int[] arr2){
        
        int index = 0;
        int[] result = new int[arr1.length + arr2.length];
        
        for(int i = 0; i<arr1.length; i++){
            result[i] = arr1[i];
        }
        
        for(int i = 0; i<arr2.length; i++){
            result[arr1.length+i] = arr2[i];
        }
        
        sortedArray(result);
    }
    
    public static void commonElement(int[] arr1, int[] arr2){
        
        boolean found = true;
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] != arr2[j]){
                    found = false;
                }
            }
            if(!found){
                System.out.println(arr1[i]);
            }
        }
    }
    
    public static void reverseArray(int[] arr){
        
        int j = arr.length - 1;
        int[] result = new int[arr.length];
        int k = 0;
        while(j>=0){
            result[k++] = arr[j--];
        }
        
        for(int i = 0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
	    int[] arr = {1,2,3,4,5,6,7,8,9};
	    sortedArray(arr);
	    System.out.println("-------rev--------");
	    reverseArray(arr);
	    System.out.println("-------mer--------");
	    int[] arr1 = {5,2,6,3};
	    int[] arr2 = {5,8,9,1};
	    mergeArray(arr1,arr2);
		System.out.println("-------right shift--------");
		rightShiftNArray(arr,5);
	    System.out.println("-------common--------");
	    commonElement(arr1,arr2);
		System.out.println("-------distinctElement--------");
		distinctElement(arr1,arr2);
		System.out.println("-------freq--------");
		frequency(arr);
		System.out.println("-------maxmin--------");
		MaxMin(arr);
		System.out.println();
		System.out.println("---------------");
		System.out.println("enter the nth max element to find: ");
		int n = sc.nextInt();
		BubbleSort(arr,n);
		
	}
}