package chapter06.exercises.exercise03;

/**
 * Mitarbeiter
 * 
 * @author Daniel Appenmaier
 *
 */
public class Employee {

	/*
	 * Attribute
	 */
	private int employeeId;
	private Person person;
	private int salary;

	/*
	 * Methoden
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

	public void setSalary(int salary) throws SalaryDecreaseException, SalaryIncreaseTooHighException {
		if (salary < this.salary) {
			throw new SalaryDecreaseException();
		}
		int percentageChange = salary * 100 / this.salary;
		if (percentageChange > 110) {
			throw new SalaryIncreaseTooHighException();
		}
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void print() {
		System.out.println(employeeId + " - " + person.getName() + " - " + salary + "€");
	}

}
