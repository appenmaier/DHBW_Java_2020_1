package chapter03.demos.demo03;

import java.util.Scanner;

/**
 * Mehrfachverzweigung mit switch-case
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0303 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("R, G oder B: ");
		char colour = sc.next().charAt(0);

		String colourText;
		switch (colour) {
		case 'r':
		case 'R':
			colourText = "rot";
			break;
		case 'g':
		case 'G':
			colourText = "grün";
			break;
		case 'b':
		case 'B':
			colourText = "blau";
			break;
		default:
			colourText = "";
			break;
		}

		// ab Java 14
		String colourText2 = switch (colour) {
		case 'r', 'R' -> "rot";
		case 'g', 'G' -> "grün";
		case 'b', 'B' -> "blau";
		default -> "";
		};

		System.out.println(colourText);
		System.out.println(colourText2);

		sc.close();

	}

}
