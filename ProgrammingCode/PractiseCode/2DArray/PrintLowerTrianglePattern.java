import java.util.Scanner;

public class PrintLowerTrianglePattern {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		String str = Integer.toString(input);
        int count = str.length();
        
        char[][] arr = new char[count][count];
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				if(i>=j){
					arr[i][j] = str.charAt(j);
				}else{
					arr[i][j] = '0';
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}