package chapter03.exercises.exercise11;

import java.util.Random;
import java.util.Scanner;

public class Exercise0311 {

	public static void main(String[] args) {

		Random rd = new Random();
		int randomNumber = rd.nextInt(100) + 1;

		Scanner sc = new Scanner(System.in);

		boolean loop = true;
		int attempts = 0;

		while (loop) {
			System.out.print("Bitte den Tipp eingeben: ");
			int tip = sc.nextInt();
			attempts++;

			if (tip > randomNumber) {
				System.out.println("Leider falsch, die gesuchte Zahl ist kleiner");
			} else if (tip < randomNumber) {
				System.out.println("Leider falsch, die gesuchte Zahl ist größer");
			} else {
				System.out.println("Richtig, Sie haben " + attempts + " Versuche benötigt");
				loop = false;
			}

			if (loop) {
				System.out.print("Möchten Sie nochmal raten (true, false): ");
				loop = sc.nextBoolean();
			}
		}

		sc.close();

	}

}
