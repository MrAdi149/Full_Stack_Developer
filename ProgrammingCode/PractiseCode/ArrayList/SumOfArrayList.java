import java.util.*;

public class SumOfArrayList {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++){
			arr.add(sc.nextInt());
		}
		
		sumOfArrayList(arr);
	}
	
	public static void sumOfArrayList(ArrayList<Integer> arr){
		
		int sum = 0;
		
		for(int i = 0; i<arr.size(); i++){
			sum = sum + arr.get(i);
		}
		
		System.out.println("Sum of array list is: " + sum);
	}
}