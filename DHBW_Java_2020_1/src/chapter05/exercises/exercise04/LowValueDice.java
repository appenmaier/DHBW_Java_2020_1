package chapter05.exercises.exercise04;

import java.util.Random;

/**
 * Spezialwürfel: 1-2-3-Würfel
 * 
 * @author Daniel Appenmaier
 *
 */
public class LowValueDice extends Dice {

	/*
	 * Methoden
	 */
	public LowValueDice(int id) {
		super(id);
	}

	public void rollTheDice() {
		Random random = new Random();
		value = random.nextInt(3) + 1;
	}

}
