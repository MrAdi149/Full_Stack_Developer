//Swap frist letter n last letter in each wrd
//Aditya Kumar Singh
//adityA rumaK hingS


import java.util.Scanner;

public class SwapFirstAndLastLetter {
	
	ma

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		int space = 0;
		
		for(int i = 0; i<= ch.length; i++){
			if(i==ch.length || ch[i] == ' '){
				if(space != i - 1){
					char temp = ch[space];
					ch[space] = ch[i-1];
					ch[i-1] = temp;
				}
				space = i + 1;
			}
		}
		
		for(int i = 0; i<ch.length; i++){
			System.out.print(ch[i]);
		}
	}	
}