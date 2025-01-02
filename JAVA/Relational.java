class Relational{
	public static void main(String[] args){
		
		//AND Operator
		System.out.println(true == true && true != false);
		System.out.println(10 >= 5 && 10 <= 10);
		System.out.println(20 != 20 && 20 == 20);
		System.out.println('a'>='A' && 'f' <= 'F');
		System.out.println('a'<='Z' && 'A' <= 'z');
		
		//OR Operator
		System.out.println(true == true || true != false);
		System.out.println(10 <= 5 || 20 <= 10);
		System.out.println(20 != 20 || 20 == 20);
		System.out.println('a'>='A' || 'f' <= 'F');
		System.out.println('a'<='Z' || 'A' <= 'z');
		
		//NOT Operator
		System.out.println(!true);
		System.out.println(!false);
	}
}