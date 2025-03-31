import java.util.Scanner;

class countApplesOrange {
	
	public static void countApplesOrange(int[] apple, int[] orange, int l_Range, int r_Range, int apple_loc, int orange_loc){
		
		int countApple = 0;
		int countOrange = 0;
		
		for(int i = 0; i<apple.length; i++){
			if(apple[i]+apple_loc<=r_Range && apple[i]+apple_loc>=l_Range){
				countApple++;
			}
		}
		
		for(int i = 0; i<orange.length; i++){
			if(orange[i] + orange_loc <= r_Range && orange[i] + orange_loc >= l_Range){
				countOrange++;
			}
		}
		
		int[] result= new int[2];
		result[0] = countApple;
		result[1] = countOrange;
		
		System.out.println(result[0] + " " + result[1]);
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Apple array: ");
		int n = sc.nextInt();
		int[] apple = new int[n];
		System.out.println("Enter the elments in the array: ");
		for(int i = 0; i<n; i++){
			apple[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of Orange array: ");
		int x = sc.nextInt();
		int[] orange = new int[x];
		System.out.println("Enter the elments in the array: ");
		for(int i = 0; i<x; i++){
			orange[i] = sc.nextInt();
		}
		
		System.out.println("Enter the L_Range: ");
		int l_Range = sc.nextInt();
		System.out.println("Enter the R_Range: ");
		int r_Range = sc.nextInt();
		
		System.out.println("Enter Apple tree location: ");
		int apple_loc = sc.nextInt();
		System.out.println("Enter Orange tree location: ");
		int orange_loc = sc.nextInt();
		
		countApplesOrange(apple,orange,l_Range,r_Range,apple_loc,orange_loc);
	}
}