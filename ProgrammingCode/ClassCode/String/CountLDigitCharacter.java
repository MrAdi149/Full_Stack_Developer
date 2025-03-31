import java.util.Scanner;

class CountLDigitCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        int count = 0;
        
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
