package chapter02.exercises.exercise08;

import java.util.Scanner;

public class Exercise0208 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Bitte eine Ganzzahl eingeben: ");
		int a = sc.nextInt();

		System.out.print("Bitte eine weitere Ganzzahl eingeben: ");
		int b = sc.nextInt();

		sc.close();

		double c = a * 100.0 / b;
		System.out.println("Berechnung: " + a + " von " + b + " sind " + c + "%");
		System.out.printf("Berechnung: %d von %d sind %.2f%%%n", a, b, c);
		System.out.printf("Berechnung: %d von %d sind %.2f%%%n", a, b, (a * 100.0 / b));

	}

}
