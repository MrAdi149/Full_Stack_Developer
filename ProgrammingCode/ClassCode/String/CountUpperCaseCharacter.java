import java.util.Scanner;

class CountUpperCaseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        int count = 0;
        
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
