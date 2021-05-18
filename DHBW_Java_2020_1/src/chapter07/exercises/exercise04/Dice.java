package chapter07.exercises.exercise04;

import java.io.File;
import java.util.Random;

import javafx.scene.image.Image;

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
	private int value;
	private Image image;

	/*
	 * Methoden
	 */
	public Dice() {
		rollTheDice();
	}

	public void rollTheDice() {
		Random random = new Random();
		value = random.nextInt(6) + 1;
		switch (value) {
		case 1:
			image = new Image(getClass().getResourceAsStream("../../../resources/dice/one.PNG"));
			break;
		case 2:
			image = new Image(getClass().getResourceAsStream("../../../resources/dice/two.PNG"));
			break;
		case 3:
			image = new Image(new File("src/resources/dice/three.PNG").toURI().toString());
			break;
		case 4:
			image = new Image(new File("src/resources/dice/four.PNG").toURI().toString());
			break;
		case 5:
			image = new Image("resources/dice/five.PNG");
			break;
		case 6:
			image = new Image("resources/dice/six.PNG");
			break;
		}
	}

	public int getValue() {
		return value;
	}

	public Image getImage() {
		return image;
	}

}
