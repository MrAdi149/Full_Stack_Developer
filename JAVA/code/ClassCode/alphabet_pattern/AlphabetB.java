import java.util.Scanner;

class AlphabetB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n+2; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || (i == 1 || i == n || i == n / 2 + 1) && j < n || (j == n && (i != 1 && i != n / 2 + 1 && i != n))) { 
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
