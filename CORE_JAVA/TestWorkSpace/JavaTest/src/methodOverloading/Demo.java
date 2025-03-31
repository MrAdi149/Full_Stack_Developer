package methodOverloading;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calculator = new Calculator();
		
		System.out.println(calculator.add(2, 3));
		System.out.println(calculator.add(2.5, 2.4));
		System.out.println(calculator.add(2, 4, 5));
	}

}
