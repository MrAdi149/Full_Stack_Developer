import java.util.Scanner;

public class UpperTitleCaseToLoweTitleCase {

    public static void stringToTitleCase(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            if (i == ch.length - 1 || ch[i + 1] == ' ') { 
                ch[i] = (char) (ch[i] - 32); 
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