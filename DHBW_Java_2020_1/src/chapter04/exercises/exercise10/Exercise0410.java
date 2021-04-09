package chapter04.exercises.exercise10;

import java.util.Scanner;

public class Exercise0410 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double x1 = 0, x2 = 0;

		System.out.print("Bitte den Wert für a eingeben: ");
		double a = scanner.nextFloat();
		System.out.print("Bitte den Wert für b eingeben: ");
		double b = scanner.nextFloat();
		System.out.print("Bitte den Wert für c eingeben: ");
		double c = scanner.nextFloat();

		scanner.close();

		x1 = ((-b + Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a));
		x2 = ((-b - Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a));

		System.out.printf("x1 = %.1f%n", x1);
		System.out.printf("x2 = %.1f%n", x2);

	}

}
