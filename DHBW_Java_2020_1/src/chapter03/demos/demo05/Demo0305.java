package chapter03.demos.demo05;

import java.util.Scanner;

/**
 * Schleifensteuerung mit break und continue
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0305 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numberOfLoopPasses = 0;

		while (true) {
			numberOfLoopPasses++;
			System.out.print("1=nothing, 2=continue, 3=break: ");
			int answer = sc.nextInt();
			if (answer == 2) {
				continue; // Schleifendurchlauf beenden
			} else if (answer == 3) {
				break; // Schleife beenden
			}
			System.out.println("Schleifendurchlauf " + numberOfLoopPasses);
		}

		sc.close();

	}

}
