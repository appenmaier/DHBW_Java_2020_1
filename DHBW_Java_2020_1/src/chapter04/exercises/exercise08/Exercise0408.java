package chapter04.exercises.exercise08;

import java.util.Scanner;

public class Exercise0408 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Bitte einen Wert zwischen -1 und -32.768 eingeben:");
		short s = scanner.nextShort();
		System.out.println("Der vorzeichenfreie Dezimalwert beträgt: " + Short.toUnsignedInt(s));

		scanner.close();

	}

}
