import java.util.Scanner;

class OccurenceOfArray {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []a = new int[n];
		
		for(int i = 0; i<a.length; i++){
			a[i] = sc.nextInt();
			int count = 0;
			
			for(int j = 0; j<a.length; j++){
				if(a[i] == a[j]){
					count++;
				}
			}
			
			System.out.println("the occurence of " + a[i] + " is " + count);
		}
	}
}