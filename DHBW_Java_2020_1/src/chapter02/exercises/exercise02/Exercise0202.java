package chapter02.exercises.exercise02;

public class Exercise0202 {

	public static void main(String[] args) {
		String name = "Daniel";
		int age = 38;
		char gender = 'm';

		Exercise0202.print(name, age, gender);
		Exercise0202.print("Yvonne", 38, 'w');
	}

	public static void print(String name, int age, char gender) {
		System.out.println("Name: " + name);
		System.out.println("Alter: " + age);
		System.out.println("Geschlecht: " + gender);
	}

}
