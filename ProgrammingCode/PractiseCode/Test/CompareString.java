//Compare 2 string equal or not

import java.util.Scanner;

public class CompareString {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		boolean flag = true;
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		if(c1.length != c2.length){
			flag = false;
		}else{
			for(int i = 0; i<c1.length; i++){
				if(c1[i] != c2[i]){
					flag = false;
					break;
				}
			}
		}
		
		if(flag == true){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
}
		