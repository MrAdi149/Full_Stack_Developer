import java.util.Scanner;

class StoreArrayWithoutNewArray {
    
    public static void remove(int[] arr, int index){
		
		if(index >=0 && index<arr.length){
			arr[index] = 0;
		}else{
			System.out.println("out of index");
		}
        
        for(int i = index; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }

        for(int i = 0; i < arr.length - 1; i++){
            System.out.println(arr[i]);
        }
    }        
        
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
		System.out.println("enter the element of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
		System.out.print("enter the index to remove the element: ");
        int index = sc.nextInt();
		
        remove(arr,index);
        
        sc.close();
    }
}
