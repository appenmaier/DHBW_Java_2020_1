package chapter04.demos.demo07;

/**
 * Farbe
 * 
 * @author Daniel Appenmaier
 *
 */
public class Colour {

	/*
	 * Aufzählungskonstanten
	 */
	public final static Colour RED = new Colour("rot");
	public final static Colour BLUE = new Colour("blau");
	public final static Colour GREEN = new Colour("grün");

	/*
	 * Attribute
	 */
	private String colour; // Farbe

	/*
	 * Methoden
	 */
	private Colour(String colour) {
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

}
