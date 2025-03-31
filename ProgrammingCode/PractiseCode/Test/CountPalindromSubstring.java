import java.util.Scanner;

public class CountPalindromSubstring {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		int n = sc.nextInt();
		char[] ch = s1.toCharArray();
		int index = 0;
		int[] sumArray = new int[ch.length - n + 1];
		
		for(int i = 0; i<=ch.length-n; i++){
			int sum = 0;
			for(int j = i; j<i+n; j++){
				sum = sum + ch[j];
			}
			sumArray[i] = sum;
		}
		
		int fmax = sumArray[0];
		int fmin = sumArray[0];		
		
		for(int i = 0; i<sumArray.length; i++){
			if(sumArray[i] > fmax){
				fmax = sumArray[i];
			}
			
			if(sumArray[i] < fmin){
				fmin = sumArray[i];
			}
		}
		
		System.out.println(fmax);
		System.out.println(fmin);
	}
	
}