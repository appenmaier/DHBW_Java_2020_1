package chapter06.exercises.exercise02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise0602 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		Barrel barrel;

		while (true) {
			try {
				System.out.print("Bitte Kapazität des Fasses eingeben: ");
				int capacity = scanner.nextInt();
				barrel = new Barrel(capacity);
				break;
			} catch (InputMismatchException e) {
				System.err.println("Ungültige Eingabe, bitte nochmal");
				scanner.next();
			}
		}

		while (loop) {
			int amount;
			while (true) {
				try {
					System.out
							.print("Bitte die Menge der hinzuzufügenden Flüssigkeit angeben: ");
					amount = scanner.nextInt();
					try {
						barrel.addFluid(amount);
					} catch (BarrelOverflowException e) {
						System.out.println(e.getMessage());
					}
					break;
				} catch (InputMismatchException e) {
					System.err.println("Ungültige Eingabe, bitte nochmal");
					scanner.next();
				}
			}

			barrel.displayFluidLevel();

			while (true) {
				try {
					System.out.print("Nochmal?: ");
					loop = scanner.nextBoolean();
					break;
				} catch (InputMismatchException e) {
					System.err.println("Ungültige Eingabe, bitte nochmal");
					scanner.next();
				}
			}
		}

		scanner.close();

	}

}
