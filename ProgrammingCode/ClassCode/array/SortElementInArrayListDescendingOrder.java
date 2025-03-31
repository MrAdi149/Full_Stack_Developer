import java.util.*;

public class SortElementInArrayListDescendingOrder {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array list: ");
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i<n; i++){
			arr.add(sc.nextInt());
		}
		
		sortElementInArrayListDescendingOrder(arr);
	}
	
	public static void sortElementInArrayListDescendingOrder(ArrayList<Integer> arr){
		
		for(int i = 0; i<arr.size()-1; i++){
			for(int j = 0; j<arr.size()-1-i; j++){
				if(arr.get(j+1) > arr.get(j)){
					int temp = arr.get(j+1);
					arr.set(j+1,arr.get(j));
					arr.set(j,temp);
				}
			}
		}
		
		System.out.println(arr);
	}
}