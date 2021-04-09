package chapter04.demos.demo07;

/**
 * Farbe
 * 
 * @author Daniel Appenmaier
 *
 */
public enum ColourEnum {

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
	ColourEnum(String colour) {
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

}
