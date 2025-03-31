import java.util.*;

public class MergeTwoArrayList {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> brr = new ArrayList<Integer>();
		ArrayList<Integer> crr = new ArrayList<Integer>();
		 
		System.out.println("Enter the size of first array element: ");
		int m = sc.nextInt();
		
		for(int i = 0; i<m; i++){
			arr.add(sc.nextInt());
		}
		
		System.out.println("Enter the size of second array element: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++){
			brr.add(sc.nextInt());
		}
		
		crr.addAll(arr);
		crr.addAll(brr);
		
		System.out.println(crr);
	}
}