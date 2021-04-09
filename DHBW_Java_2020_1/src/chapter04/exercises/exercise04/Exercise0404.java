package chapter04.exercises.exercise04;

import java.util.ArrayList;

public class Exercise0404 {

	public static void main(String[] args) {

		ArrayList<Dice> dices = new ArrayList<>();

		for (int i = 1; i < 6; i++) {
			Dice dice = new Dice(i);
			dices.add(dice);
		}

		System.out.println("ID - Würfelwert");
		for (Dice dice : dices) {
			dice.rollTheDice();
			System.out.println(dice.getId() + " - " + dice.getValue());
		}

	}

}
