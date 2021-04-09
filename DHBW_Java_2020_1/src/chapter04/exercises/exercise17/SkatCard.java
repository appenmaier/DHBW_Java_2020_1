package chapter04.exercises.exercise17;

/**
 * Karte (Skat)
 * 
 * @author Daniel Appenmaier
 *
 */
public class SkatCard {

	/*
	 * Attribute
	 */
	private SkatCardColor color;
	private SkatCardValue value;

	/*
	 * Methoden
	 */
	public SkatCard(SkatCardColor color, SkatCardValue value) {
		this.color = color;
		this.value = value;
	}

	public SkatCardColor getColor() {
		return color;
	}

	public SkatCardValue getValue() {
		return value;
	}

	public String getCardDescription() {
		return color.getDescription() + " " + value.getDescription();
	}

}
