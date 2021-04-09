package chapter04.exercises.exercise16;

public class Exercise0416 {

	public static void main(String[] args) {

		Company company = new Company("Maier GmbH");

		Person person1 = new Person("Max Schmid");
		Person person2 = new Person("Hans Müller");
		Person person3 = new Person("Lisa Maier");
		Person person4 = new Person("David Schneider");
		Person person5 = new Person("Miriam Albers");

		Employee employee1 = new Employee(person1, 50000);
		Employee employee2 = new Employee(person2, 75000);
		Employee employee3 = new Employee(person3, 40000);
		Employee employee4 = new Employee(person4, 55000);
		Employee employee5 = new Employee(person5, 90000);

		company.addEmployee(employee1);
		company.addEmployee(employee2);
		company.addEmployee(employee3);
		company.addEmployee(employee4);
		company.addEmployee(employee5);

		company.print();

	}

}
