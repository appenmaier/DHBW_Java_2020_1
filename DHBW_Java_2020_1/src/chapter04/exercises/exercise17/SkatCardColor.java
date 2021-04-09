package chapter04.exercises.exercise17;

/**
 * Spielfarbe (Skat)
 * 
 * @author Daniel Appenmaier
 *
 */
public enum SkatCardColor {

	DIAMONDS("Karo"), HEARTS("Herz"), SPADE("Pik"), CLUBS("Kreuz");

	/*
	 * Attribute
	 */
	private String description;

	/*
	 * Methoden
	 */
	SkatCardColor(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
