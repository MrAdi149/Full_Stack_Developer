import java.util.*;

public class MinimumElement {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array list: ");
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i<n; i++){
			arr.add(sc.nextInt());
		}
		
		minimumElement(arr);
	}
	
	public static void minimumElement(ArrayList<Integer> arr){
		
		int min = arr.get(0);
		
		for(int i = 0; i < arr.size(); i++){
			if(arr.get(i) < min){
				min = arr.get(i);
			}
		}
		
		System.out.println("The minimum element is: " + min);
	}		
}