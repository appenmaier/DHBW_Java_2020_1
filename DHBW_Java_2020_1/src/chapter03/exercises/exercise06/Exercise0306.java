package chapter03.exercises.exercise06;

import java.util.Scanner;

public class Exercise0306 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Bitte den Namen eingeben: ");
		String name = sc.next();

		System.out.print("Bitte das Geschlecht eingeben (1=m, 2=w, 3=d): ");
		int gender = sc.nextInt();

		String title = switch (gender) {
		case 1 -> " Herr";
		case 2 -> " Frau";
		default -> "";
		};

		System.out.println("Hallo" + title + " " + name + "!");

		sc.close();

	}

}
