package singletonPattern;

public class Sample {
	String a;
	
	Sample(String a)
	{
		this.a=a;
	}
	
	

	public static void main(String[] args) {
		String s1 = "Aditya";
		String s2 = "Kumar";
		s1 = "Singh";
		System.out.println("-------------String Immutability----------------");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.equals(s2));
		
		System.out.println("-------------------------------------");
		
		Sample s = new Sample("Aditya");
		System.out.println(s);
		System.out.println(s.a);
		
		s = new Sample("Singh");
		System.out.println(s);
		System.out.println(s.a);
		
		System.out.println("------------------------------------");
		
		int[] arr = {1,2,3};
		
		for(int i = 0; i<5; i++) {
			
			try {
				System.out.println(arr[i]); //1
				try {
					Thread.sleep(-2000);
				}
				 catch(Exception e)
				{
					 System.out.println("hi");
				}
			}
			catch(Exception e){
				System.out.println("hello");
			}
		}
		
		
	}
}
