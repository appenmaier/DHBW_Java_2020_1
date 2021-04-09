package chapter04.exercises.exercise11;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercise0411 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bitte das Datum eingeben (dd.mm.yyyy):");
		String input = scanner.next();

		scanner.close();

		int day = Integer.valueOf(input.substring(0, 2));
		int month = Integer.valueOf(input.substring(3, 5));
		int year = Integer.valueOf(input.substring(6, 10));

		LocalDateTime inputDate = LocalDateTime.of(year, month, day, 0, 0, 0);
		int dayOfInputDate = inputDate.getDayOfYear();
		LocalDateTime christmasDate = LocalDateTime.of(year, 12, 24, 0, 0, 0);
		int dayOfChristmasDate = christmasDate.getDayOfYear();

		System.out.println("Wochentag: " + inputDate.getDayOfWeek());
		if (dayOfInputDate > dayOfChristmasDate) {
			System.out.println("Tage bis Weihnachten: " + (dayOfInputDate - dayOfChristmasDate));
		} else {
			System.out.println("Tage bis Weihnachten: " + (dayOfChristmasDate - dayOfInputDate));
		}

	}

}
