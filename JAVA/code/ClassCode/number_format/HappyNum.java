import java.util.HashSet;
import java.util.Scanner;

class HappyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        while (n != 1 && n!= 4) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum = sum + digit * digit;
                n = n / 10;
            }
            n = sum;
        }

        if (n == 1) {
            System.out.println("Happy num");
        } else {
            System.out.println("Not happy num");
        }
    }
}
