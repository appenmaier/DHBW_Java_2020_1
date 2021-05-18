package chapter07.exercises.exercise04;

import javafx.scene.image.Image;

/**
 * Model für Demo0704
 * 
 * @author Daniel Appenmaier
 *
 */
public class Model {

	/*
	 * Attribute
	 */
	private static Model instance;
	private Dice dice;

	/*
	 * Methoden
	 */
	private Model() {
		dice = new Dice();
	}

	public static Model getInstance() {
		if (instance == null) {
			instance = new Model();
		}
		return instance;
	}

	public void rollTheDice() {
		dice.rollTheDice();
	}

	public Image getDiceImage() {
		return dice.getImage();
	}

	public int getDiceValue() {
		return dice.getValue();
	}

}
