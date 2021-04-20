package chapter05.exercises.exercise04;

import java.util.Random;

/**
 * Würfel
 * 
 * @author Daniel Appenmaier
 *
 */
public class Dice {

	/*
	 * Attribute
	 */
	private int id;
	protected int value;

	/*
	 * Methoden
	 */
	public Dice(int id) {
		this.id = id;
		rollTheDice();
	}

	public int getId() {
		return id;
	}

	public int getValue() {
		return value;
	}

	public void rollTheDice() {
		Random random = new Random();
		value = random.nextInt(6) + 1;
	}

}
