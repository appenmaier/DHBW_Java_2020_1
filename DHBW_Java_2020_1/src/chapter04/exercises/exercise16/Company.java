package chapter04.exercises.exercise16;

import java.util.ArrayList;

/**
 * Unternehmen
 * 
 * @author Daniel Appenmaier
 *
 */
public class Company {

	/*
	 * Attribute
	 */
	private String name;
	private ArrayList<Employee> employees;
	private int noEmployees;

	/*
	 * Methoden
	 */
	public Company(String name) {
		this.name = name;
		employees = new ArrayList<>();
	}

	public void addEmployee(Employee employee) {
		noEmployees++;
		employee.setEmployeeId(noEmployees);
		employees.add(employee);
	}

	public void print() {
		System.out.println(name);
		System.out.println();
		for (Employee employee : employees) {
			employee.print();
		}
	}

}
