package chapter03.exercises.exercise12;

import java.util.Scanner;

public class Exercise0312 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int k;
		double p;
		boolean loop;

		do {
			System.out.print("Bitte das Startkapital eingeben (in €): ");
			k = scanner.nextInt();
			System.out.print("Bitte den Prozentsatz eingeben: ");
			p = scanner.nextDouble();
			System.out.println("Der Jahreszins beträgt " + (int) calculateInterestPerAnnum(k, p) + "€");
			System.out.print("Wollen Sie einen weiteren Jahreszins berechnen (true, false)?: ");
			loop = scanner.nextBoolean();
		} while (loop);

		scanner.close();

	}

	static double calculateInterestPerAnnum(int k, double p) {
		return k * p / 100;
	}

}
