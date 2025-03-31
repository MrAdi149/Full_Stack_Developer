//wajp to covert the first character of each character to upper case and rest in lower case

import java.util.Scanner;

public class FirstCharToUpperCaseAndRestLowerCase {

    public static void stringToTitleCase(char[] ch) {
        boolean flag = true;

        for (int i = 0; i < ch.length; i++) {
            if (i==0 || (ch[i] != ' ' && ch[i-1] == ' ')) {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char) (ch[i] - 32);
                }
            }else {
                if (ch[i] >= 'A' && ch[i] <= 'Z') {
                    ch[i] = (char) (ch[i] + 32);
                }
            }
        }
        System.out.println(ch);
    }
	
	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        stringToTitleCase(ch);
    }
}