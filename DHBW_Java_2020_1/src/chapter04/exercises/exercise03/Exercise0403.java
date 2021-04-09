package chapter04.exercises.exercise03;

public class Exercise0403 {

	public static void main(String[] args) {

		Dice dice = new Dice(1);

		System.out.println("ID - Würfelwert");
		for (int i = 0; i < 5; i++) {
			dice.rollTheDice();
			System.out.println(dice.getId() + " - " + dice.getValue());
		}

	}

}
