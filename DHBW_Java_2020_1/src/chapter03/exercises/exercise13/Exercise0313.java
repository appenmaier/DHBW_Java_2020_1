package chapter03.exercises.exercise13;

import java.util.Scanner;

public class Exercise0313 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int k;
		float p;
		int n;
		boolean loop;

		do {
			System.out.print("Bitte das Startkapital eingeben (in €): ");
			k = scanner.nextInt();
			System.out.print("Bitte den Prozentsatz eingeben: ");
			p = scanner.nextFloat();
			System.out.print("Bitte die Anzahl Jahre eingeben: ");
			n = scanner.nextInt();
			System.out.println("Das Endkapital beträgt " + (int) calculateInterest(k, p, n) + "€");
			System.out.print("Wollen Sie eine weitere Zinsrechnung durchf�hren (true, false)?: ");
			loop = scanner.nextBoolean();
		} while (loop);

		scanner.close();

	}

	static double calculateInterest(int k, float p, int n) {
		if (n == 0) {
			return k;
		}
		return calculateInterest(k, p, n - 1) * (1 + p / 100);
	}

}
