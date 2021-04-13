package chapter05.demos.demo03;

/**
 * Glühbirne
 * 
 * @author Daniel Appenmaier
 *
 */
public class LightBulb {

	/*
	 * Attribute
	 */
	private Colour colour; // Farbe

	/*
	 * Methoden
	 */
	public LightBulb(Colour colour) {
		this.colour = colour;
	}

	public Colour getColour() {
		return colour;
	}

}
