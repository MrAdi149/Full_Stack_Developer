package com.jsp.hibernate.employeeDB.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.hibernate.employeeDB.entity.Employee;

public class EmployeeDao {

	Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Scanner sc = new Scanner(System.in);

	public void addEmployee() {
		Employee employee = new Employee();
		System.out.println("Enter the employee id: ");
		int id = sc.nextInt();
		employee.setEmployeeId(id);

		System.out.println("Enter the employee name: ");
		String name = sc.next();
		employee.setEmployeeName(name);

		System.out.println("Enter the employee email: ");
		String email = sc.next();
		employee.setEmail(email);

		System.out.println("Enter the employee description: ");
		String desc = sc.next();
		employee.setDesc(desc);

		System.out.println("Enter the employee salary: ");
		int salary = sc.nextInt();
		employee.setSalary(salary);

		System.out.println("Enter the employee experience: ");
		int experience = sc.nextInt();
		employee.setExperience(experience);

		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(employee);
		trans.commit();
		session.close();
		sf.close();
	}

	public void findEmployeeById() {

		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		System.out.println("Enter the employee id, you need to find: ");
		int findId = sc.nextInt();
		Employee employee = session.load(Employee.class, findId);
		

		trans.commit();
		session.close();
		sf.close();

	}

	public void updateEmployeeDescAndSalaryById() {
        Session session = sf.openSession();
        Transaction trans = session.beginTransaction();

        System.out.println("Enter the employee id, you want to update: ");
        int findId = sc.nextInt();

        Employee employee = session.get(Employee.class, findId);
        if (employee != null) {
            System.out.println("Enter new description: ");
            String desc = sc.next();
            employee.setDesc(desc);

            System.out.println("Enter new salary: ");
            int salary = sc.nextInt();
            employee.setSalary(salary);

            System.out.println("Updated employee: " + employee);
        } else {
            System.err.println("Employee not found!!");
        }

        trans.commit();
        session.close();
    }


	public void deleteEmployeeById() {

		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		System.out.println("Enter the employee id, you want to update: ");
		int findId = sc.nextInt();

		Employee employee = session.get(Employee.class, findId);
		if (employee != null) {
			session.delete(employee);
			System.out.println("Deleted Employee: "+employee);
		} else {
			System.err.println("Emplyee not found!!");
		}

		System.out.println(employee);

		trans.commit();
		session.close();
		sf.close();

	}

}
