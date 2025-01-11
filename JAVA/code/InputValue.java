import java.util.*;

class InputValue{
	public static void main(String[] args){
		int i;
		long l;
		byte b;
		String s;
		float f;
		double d;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Int: ");
		i = sc.nextInt();
		System.out.println("the value of int is: " + i);
		
		System.out.print("Enter long: ");
		l = sc.nextLong();
		System.out.println("the value of long is: " + l);
		
		System.out.print("Enter Byte: ");
		b = sc.nextByte();
		System.out.println("the value of byte is: " + b);
		sc.nextLine();
		System.out.print("Enter String: ");
		s = sc.nextLine();
		System.out.println("the value of String is: " + s);
		
		System.out.print("Enter Float: ");
		f = sc.nextFloat();
		System.out.println("the value of float is: " + f);
		
		System.out.print("Enter Double: ");
		d = sc.nextDouble();
		System.out.println("the value of double is: " + d);
	}
}