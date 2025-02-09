package Generalisation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee;
		employee = new Developer();
		employee.work();
		
		employee = new HR();
		employee.work(); 
	}
}