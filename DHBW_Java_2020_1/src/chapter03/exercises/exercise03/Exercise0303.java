package chapter03.exercises.exercise03;

import java.util.Scanner;

public class Exercise0303 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Bitte den Vornamen eingeben: ");
		String firstName = sc.next();

		System.out.print("Bitte den Nachnamen eingeben: ");
		String familyName = sc.next();

		System.out.print("Bitte das Alter eingeben: ");
		int age = sc.nextInt();

		System.out.print("Bitte das Geschlecht eingeben: ");
//		char gender = sc.next().charAt(0);
		String gender = sc.next();

		if ((gender.equals("m") || gender.equals("M")) && age > 17) {
			System.out.println("Hallo Herr " + familyName + "!");
		} else if ((gender.equals("w") || gender.equals("W")) && age > 17) {
			System.out.println("Hallo Frau " + familyName + "!");
		} else {
			System.out.println("Hallo " + firstName + "!");
		}

		sc.close();

	}

}
