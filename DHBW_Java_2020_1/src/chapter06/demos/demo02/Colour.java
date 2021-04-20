package chapter06.demos.demo02;

/**
 * Farbe
 * 
 * @author Daniel Appenmaier
 *
 */
public enum Colour {

	/*
	 * Aufzählungskonstanten
	 */
	RED("rot"), BLUE("blau"), GREEN("grün");

	/*
	 * Attribute
	 */
	private String colour; // Farbe

	/*
	 * Methoden
	 */
	Colour(String colour) {
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

}
