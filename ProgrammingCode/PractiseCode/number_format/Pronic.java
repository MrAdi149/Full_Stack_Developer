import java.util.Scanner;

class Pronic{
	public static void main(String[] args){
		int n = 12;
		int curr = 0;
		int prev = 0;
		boolean isPronic = false;
		
		for(int i = 1; i<=n/2; i++){
			prev = i; 
			curr = i + 1;
			
			if(prev * curr == n){
				isPronic = true;
				break;
			}
		}
		
		if(isPronic){
			System.out.println("pronic num");
		}else{
			System.out.println("not pronic num");
		}
	}
}
			
