import java.util.*;

public class LeaderInArray {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		ArrayList<Integer> result = leaders(arr);
        
        for (int res : result) {
            System.out.print(res + " ");
        }
        System.out.println();
	}
	
	public static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int j;
          
            for (j = i + 1; j < n; j++) {
              
                if (arr[i] < arr[j])
                    break;
            }
            
            if (j == n)
                result.add(arr[i]);
        }
        
        return result;
    }
}


