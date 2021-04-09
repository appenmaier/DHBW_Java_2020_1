package chapter04.demos.demo03;

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
	private String colour; // Farbe

	/*
	 * Methoden
	 */
	public LightBulb(String colour) {
		this.colour = colour;
	}
	
	public String getColour() {
		return colour;
	}

}
