package chapter03.exercises.exercise04;

import java.util.Random;
import java.util.Scanner;

public class Exercise0304 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random rd = new Random();
		int randomNumber = rd.nextInt(100) + 1;

		System.out.print("Spieler 1, bitte Deinen Tipp eingeben: ");
		int tip1 = sc.nextInt();

		System.out.print("Spieler 2, bitte Deinen Tipp eingeben: ");
		int tip2 = sc.nextInt();

		int distance1 = Math.abs(tip1 - randomNumber);
		int distance2 = Math.abs(tip2 - randomNumber);

		if (tip1 == tip2) {
			System.out.println("Gleiche Tipps, beide Spieler verlieren!");
		} else if (distance1 == distance2) {
			System.out.println("Zufallszahl: " + randomNumber + ", beide Spieler gewinnen!");
		} else if (distance1 > distance2) {
			System.out.println("Zufallszahl: " + randomNumber + ", Spieler 2 gewinnt!");
		} else {
			System.out.println("Zufallszahl: " + randomNumber + ", Spieler 1 gewinnt!");
		}

		sc.close();

	}

}
