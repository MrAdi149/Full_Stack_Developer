package EmployeeManager;

public class Test {

	public static void main(String[] args) {
		Manager m = new Manager();
		System.out.println(m.name);
		System.out.println(m.sal);
		m.work();
		m.manageTeam();
	}

}
