import java.util.*;

public class MaximumElement {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array list: ");
		
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i<n; i++){
			arr.add(sc.nextInt());
		}
		
		maximumElement(arr);
	}
	
	public static void maximumElement(ArrayList<Integer> arr){
		
		int max = arr.get(0);
		
		for(int i = 0; i < arr.size(); i++){
			
			if(arr.get(i) > max){
				max = arr.get(i);
			}
		}
		
		System.out.println("The maximum element is: " + max);
	}
}