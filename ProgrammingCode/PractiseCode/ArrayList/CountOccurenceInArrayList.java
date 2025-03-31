import java.util.*;

public class CountOccurenceInArrayList {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		System.out.println("Enter the size of an array list: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the objects in array list: ");
		for(int i = 0; i<n; i++){
			arr.add(sc.nextInt());
		}
		
		countOccurenceInArrayList(arr);
	}
	
	public static void countOccurenceInArrayList(ArrayList<Integer> arr){
		
		for(int i = 0; i<arr.size(); i++){
			
			if(arr.get(i)==0){
				continue;
			}
			
			int count = 1;
			
			for(int j = i+1; j<arr.size(); j++){
				if(arr.get(i) == arr.get(j)){
					count++;
					arr.set(j,0);
				}
			}
			
			System.out.println(count + " " + arr.get(i));
		}
	}
}