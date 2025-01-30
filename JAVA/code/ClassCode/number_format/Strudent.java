class Strudent{
	public static void main(String[] args){
		int marks = 50;
		int score = 70;
		
		int positive = 7;
		
		if(score>marks){
			System.out.println("Passed");
		}
		
		if(positive > 0){
			System.out.println("Positive");
		}
		
		//write a java program to print the message if the given number is even number
		
		int even = 8;
		if(even % 2 == 0){
			System.out.println("Even");
		}
		
		int a = 70;
		int b = 60;
		
		int sum = a+b;
		if(sum > 100){
			System.out.println("greater than 100");
		}
		
		int age = 20;
		if(age>18){
			System.out.println("go to vote");
		}else{
			System.out.println("minor");
		}
		
		char ch = 'A';
		if(ch>64 && ch<90){
			System.out.println("Upper");
		}else{
			System.out.println("lower");
		}
		
		char cp = 'z';
		if(cp == 'a' && cp == 'e' && cp == 'i' && cp == 'o' && cp == 'u'){
			System.out.println("vowel");
		}else{
			System.out.println("consonents");
		}
	}
}