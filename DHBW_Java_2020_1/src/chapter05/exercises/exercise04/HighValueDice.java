package chapter05.exercises.exercise04;

import java.util.Random;

/**
 * Spezialwürfel: 4-5-6-Würfel
 * 
 * @author Daniel Appenmaier
 *
 */
public class HighValueDice extends Dice {

	/*
	 * Methoden
	 */
	public HighValueDice(int id) {
		super(id);
	}

	public void rollTheDice() {
		Random random = new Random();
		value = random.nextInt(3) + 4;
	}

}
