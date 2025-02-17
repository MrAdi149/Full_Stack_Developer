import java.util.Scanner;

// F
// F E
// F E D
// F E D C
// F E D C B
// F E D C B A		

class DecreaseCharacterRightTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char b = sc.next().charAt(0);
		
		for(int i = 1; i<=n; i++){
			char a = b;
			for(int j = 1; j<=n; j++){
				if(i>=j){
					System.out.print(a-- + " ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}