package customTreeSetCollection;

import java.util.TreeSet;

public class SortEmployee {
	
	public static void main(String[] args) {
		
		SortEmployeeById id = new SortEmployeeById();
		SortEmployeeByName name = new SortEmployeeByName();
		SortEmployeeBySalary salary = new SortEmployeeBySalary();
		
		
		TreeSet<Employee> t = new TreeSet<Employee>(salary);
		
		t.add(new Employee(3,"Adi",12.5));
		t.add(new Employee(2,"Kumar",12.67));
		t.add(new Employee(5,"Singh",12.23));
		t.add(new Employee(1,"Rajput",12.93));
		t.add(new Employee(7,"Chouhan",12.91));
		
		for(Employee e: t) {
			System.out.println(e);
		}
	}

}
