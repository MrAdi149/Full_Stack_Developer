import java.util.Scanner;

class CountSpecialCaseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        int count = 0;
        
        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] >= 32 && ch[i] <= 47)||(ch[i] >= 58 && ch[i] <= 64)||(ch[i] >= 91 && ch[i] <= 96) || (ch[i] >= 123 && ch[i] <= 126)) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
