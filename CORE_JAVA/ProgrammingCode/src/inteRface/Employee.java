package inteRface;

public class Employee implements Person {
	
	@Override
	public void work() {
		System.out.println("Person works everyday.");
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		System.out.println(name);
		
		e.work();
	}

}
