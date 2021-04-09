package chapter02.exercises.exercise07;

import java.util.Scanner;

public class Exercise0207 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Bitte eine Ganzzahl eingeben: ");
		int a = sc.nextInt();

		System.out.print("Bitte eine weitere Ganzzahl eingeben: ");
		int b = sc.nextInt();

		sc.close();

		int c = a + b;
		System.out.printf("Berechnung: %d + %d = %d%n", a, b, c);
		System.out.println("Berechnung: " + a + " + " + b + " = " + c);
		System.out.printf("Berechnung: %d + %d = %d%n", a, b, (a + b));

	}

}
