class Employee{
	int id;
	int salary;
	String name;
	
	Employee(){
		this.id = 1;
		this.salary = 20;
		this.name = "Abbas";
	}
	
	Employee(int num,int sal, String nm){
		this.id = num;
		this.salary = sal;
		this.name = nm;
	}
	
	public static void main(String[] args){
		Employee e1 = new Employee();
		System.out.println("id: "+e1.id+" salary: "+e1.salary+" name: "+e1.name);
		Employee e2 = new Employee(2,15,"raju");
		System.out.println("id: "+e2.id+" salary: "+e2.salary+" name: "+e2.name);
	}
}