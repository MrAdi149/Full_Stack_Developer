package singletonPattern;

public class Sample {
	int a;
	
	Sample(int a)
	{
		this.a=a;
	}
	
	

	public static void main(String[] args) {
		String s1 = "Aditya";
		String s2 = "Kumar";
		s1 = "Singh";
		
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.equals(s2));
		
		
	}
}
