import java.util.*;

public class ReverseArrayList {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		System.out.println("Enter the size of array list: ");
		int n = sc.nextInt();
		
		System.out.println("enter the objects in array list: ");
		for(int i = 0; i<n; i++){
			arr.add(sc.nextInt());
		}
		
		reverseArrayList(arr);
	}
	
	public static void reverseArrayList(ArrayList<Integer> arr){
		
		ArrayList<Integer> brr = new ArrayList<Integer>();
		
		System.out.println("Reversed array list: ");
		for(int i = arr.size() - 1; i >= 0; i--){
			brr.add(arr.get(i));
		}
		
		System.out.println(brr);
	}
}

			