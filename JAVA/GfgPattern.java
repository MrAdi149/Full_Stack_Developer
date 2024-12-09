public class GfgPattern {

    public static void starRightTriangle(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    public static void starLeftTriangle(int n){
        for(int i = 0; i<n; i++){
            for(int j=2*(n-i); j>=0; j--){
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starRightTriangle(6);
        starLeftTriangle(6);
    }
}
