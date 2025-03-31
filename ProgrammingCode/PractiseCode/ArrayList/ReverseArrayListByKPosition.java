import java.util.Scanner;
import java.util.ArrayList;

public class ReverseArrayListByKPosition {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i<n; i++){
			arr.add(sc.nextInt());
		}
		
		System.out.println("rotate the array  by k position: ");
		int k = sc.nextInt();
		
		if(k > 0){
			k = k % arr.size();
		}else{
			System.out.println("You can't do that");
		}
		
		reverseAnArrayList(arr,0,arr.size()-1);
		reverseAnArrayList(arr,0,k-1);
		reverseAnArrayList(arr,k,arr.size()-1);
		
		System.out.println(arr);
	}
	
	public static void reverseAnArrayList(ArrayList<Integer> arr, int start, int end){
		
		while(start < end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));  
            arr.set(end, temp);      
            
            start++;
            end--;
        }
	}
}
		