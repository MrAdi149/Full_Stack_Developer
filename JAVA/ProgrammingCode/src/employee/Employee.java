package employee;

public class Employee extends Person {
	
	int employeeId;
	
	Employee(){
		super(4);
		this.employeeId = 420;
		System.out.println("employee id is: " + this.employeeId);
	}

}
