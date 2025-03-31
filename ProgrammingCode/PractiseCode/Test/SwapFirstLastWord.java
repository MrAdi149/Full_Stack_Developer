//Swap frist n last wrd 

import java.util.Scanner;

public class SwapFirstLastWord {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		int fe = 0;
		while(fe<ch.length&&ch[fe]!=' '){
			fe++;
		}
					
		int le = ch.length-1;
		
		while(le>=0&&ch[le]!=' '){
			le--;
		}
		
		String res = "";
		
		for(int i = le+1; i<ch.length; i++){
			res = res + ch[i];
		}
		
		for(int j=fe;j<=le;j++)
		{
			res = res + ch[j];
		}
		for(int a=0;a<fe;a++)
		{
			res = res + ch[a];
		}
		
		System.out.println(res);
	}
	
}