package chapter04.exercises.exercise05;

import java.util.ArrayList;

public class Exercise0405 {

	public static void main(String[] args) {

		ArrayList<Dice> dices = new ArrayList<>();
		
		for (int i = 1; i < 6; i++) {
			Dice dice = new Dice(i);
			dices.add(dice);
		}
		
		DiceCup diceCup = new DiceCup();

		System.out.println("ID - Würfelwert");
		for (int i = 1; i < 6; i++) {
			System.out.println("Wurf " + i);
			diceCup.rollTheDices(dices);
		}

	}

}
