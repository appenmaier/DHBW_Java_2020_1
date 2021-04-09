package chapter03.exercises.exercise08;

import java.util.Scanner;

public class Exercise0308 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number;
		boolean isPrime = true;

		System.out.print("Bitte eine Ganzzahl eingeben: ");
		number = scanner.nextInt();
		scanner.close();

		if (number < 2) {
			isPrime = false;
		} else if (number > 2) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		System.out.println(
				isPrime ? "Die eingegebene Zahl ist eine Primzahl!" : "Die eingegebene Zahl ist keine Primzahl!");

	}

}
