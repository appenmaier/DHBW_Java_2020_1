package chapter05.demos.demo02;

/**
 * Lampe
 * 
 * @author Daniel Appenmaier
 *
 */
public class Light {

	/*
	 * Attribute
	 */
	protected boolean isOn; // eingeschaltet?
	protected boolean isShining; // leuchtet?

	/*
	 * Methoden
	 */
	public Light() {
		isOn = false;
		isShining = false;
	}

	/**
	 * schaltet die Lampe ein
	 */
	public void switchOn() {
		isOn = true;
		isShining = true;
	}

	/**
	 * schaltet die Lampe aus
	 */
	public void switchOff() {
		isOn = false;
		isShining = false;
	}

	/**
	 * gibt alle Attribute der Lampe auf der Konsole aus
	 */
	public void print() {
		System.out.println("Eingeschaltet?: " + isOn);
		System.out.println("Leuchtet?: " + isShining);
		System.out.println();
	}

}
