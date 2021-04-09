package chapter04.exercises.exercise16;

/**
 * Mitarbeiter
 * 
 * @author Daniel Appenmaier
 *
 */
public class Employee {

	/*
	 *  Attribute
	 */
	private int employeeId;
	private Person person;
	private int salary;

	/*
	 *  Methoden
	 */
	public Employee(Person person, int salary) {
		this.person = person;
		this.salary = salary;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return person.getName();
	}

	public int getSalary() {
		return salary;
	}

	public void print() {
		System.out.println(employeeId + " - " + person.getName() + " - " + salary + "€");
	}

}
