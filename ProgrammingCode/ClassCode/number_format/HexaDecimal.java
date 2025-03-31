import java.util.Scanner;

class HexaDecimal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String hex = " ";
		
		while(n != 0){
			int rem = n % 16;
			
			switch(rem){
				
				case 10: {
					hex = 'a'+hex;
					break;
				}
				
				case 11: {
					hex = 'b'+hex;
					break;
				}
				
				case 12: {
					hex = 'c'+hex;
					break;
				}
				
				case 13: {
					hex = 'd'+hex;
					break;
				}
				
				case 14: {
					hex = 'e'+hex;
					break;
				}
				
				case 15: {
					hex = 'f'+hex;
					break;
				}
				
				default: {
					hex = rem + hex;
					break;
				}
			}
			n = n / 16;
		}
		
		System.out.println("hexadecimal format is: " + hex);
	}
}
				