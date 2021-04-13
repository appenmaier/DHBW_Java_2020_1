package chapter05.demos.demo04;

/**
 * Tischleuchte
 * 
 * @author Daniel Appenmaier
 *
 */
public final class TableLamp extends Light implements WiredDevice {

	/*
	 * Attribute
	 */
	private boolean isConnected; // eingesteckt?
	private LightBulb lightBulb; // Glühbirne

	private final static String TYPE = "Tischleuchte";
	private static int numberOfTableLamps;

	/*
	 * Methoden
	 */
	public TableLamp() {
		super();
		numberOfTableLamps++;
	}

	public TableLamp(LightBulb lightBulb) {
		super();
		this.lightBulb = lightBulb;
		numberOfTableLamps++;
	}

	/**
	 * steckt die Tischleuchte ein
	 */
	public void plugIn() {
		isConnected = true;
		if (isOn) {
			isShining = true;
		}
	}

	/**
	 * steckt die Tischleuchte aus
	 */
	public void pullThePlug() {
		isConnected = false;
		isShining = false;
	}

	/**
	 * schaltet die Tischleuchte ein
	 */
	public void switchOn() {
		isOn = true;
		if (isConnected) {
			isShining = true;
		}
	}

	/**
	 * wechselt die Glühbirne der Tischleuchte und gibt die alte Glühbirne zurück
	 * 
	 * @param newLightBulb neue Glühbirne
	 * @return alte Glühbirne
	 */
	public LightBulb changeLightBulb(LightBulb newLightBulb) {
		LightBulb oldLightBulb = lightBulb;
		lightBulb = newLightBulb;
		return oldLightBulb;
	}

	/**
	 * gibt alle Attribute der Tischleuchte auf der Konsole aus
	 */
	public void print() {
		System.out.println("Typ: " + TYPE);
		System.out.println("Eingesteckt?: " + isConnected);
		System.out.println("Eingeschaltet?: " + isOn);
		System.out.println("Leuchtet?: " + isShining);
		System.out.println("Farbe der Gühbirne: " + lightBulb.getColour().getColour());
		System.out.println();
	}

	/**
	 * gibt die Anzahl erzeugter Tischleuchten zurück
	 * 
	 * @return Anzahl erzeugter Tischleuchten
	 */
	public static int getNumberOfTableLamps() {
		return numberOfTableLamps;
	}

}
