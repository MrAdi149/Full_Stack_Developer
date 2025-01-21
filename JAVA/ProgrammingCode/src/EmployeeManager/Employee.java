package EmployeeManager;

import java.util.Scanner;

public class Employee {

	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	int sal = sc.nextInt();
	void work() {
		System.out.println(name + " is working");
	}

}
