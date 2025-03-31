package JavaLibrary;

public class Employee {
	
	int id;
	
	Employee(int id){
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(305);
		Employee e2 = new Employee(005);
		
		Employee[] e = {e1,e2};
		
		for(int i = 0; i<e.length; i++) {
			System.out.println(e[i].hashCode());
		}
	}

}
