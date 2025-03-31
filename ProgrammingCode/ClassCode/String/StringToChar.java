//wajp to conver a given string to char array without using in built method

import java.util.Scanner;

class StringToChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        char[] ch = new char[name.length()];
		
		for(int i = 0; i<ch.length; i++){
			ch[i] = name.charAt(i);
		}
 
        for (char c : ch) {
            System.out.print(c + " ");
        }
    }
}
