package customTreeSetCollection;

public class Employee {
	
	int id;
	String name;
	Double salary;
	
	Employee(int id, String name, Double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		
		return "id: " + id + " name: " + name + " salary: " + salary;
	}

}
