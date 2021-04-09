package chapter03.exercises.exercise02;

import java.util.Scanner;

public class Exercise0302 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Bitte den ersten Operanden eingeben: ");
		int operand1 = sc.nextInt();

		System.out.print("Bitte den Operator eingeben: ");
		char operator = sc.next().charAt(0);

		System.out.print("Bitte den zweiten Operanden eingeben: ");
		int operand2 = sc.nextInt();

		double result = 0;
		if (operator == '+') {
			result = operand1 + operand2;
		} else if (operator == '-') {
			result = operand1 - operand2;
		} else if (operator == '*') {
			result = operand1 * operand2;
		} else if (operator == '/') {
			result = (double) operand1 / operand2;
		} 

		System.out.printf("Berechnung: %d %c %d = %.2f", operand1, operator, operand2, result);

		sc.close();

	}

}
