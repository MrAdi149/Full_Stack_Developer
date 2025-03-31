package exceptionHandling;

import java.util.Scanner;

public class NullHandling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		try {
			str = sc.nextLine();
            if (str.isEmpty()) { 
            	NullPointerException neg = new NullPointerException("Empty input provided");
                throw neg;
            }
            System.out.println("Length of the string: " + str.length());
		}catch(NullPointerException n) {
			System.out.println("hello");
		}
	}
}
