package chapter05.demos.demo04;

/**
 * Lampe
 * 
 * @author Daniel Appenmaier
 *
 */
public abstract class Light {

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
	public abstract void switchOn();

	/**
	 * schaltet die Lampe aus
	 */
	public final void switchOff() {
		isOn = false;
		isShining = false;
	}

	/**
	 * gibt alle Attribute der Lampe auf der Konsole aus
	 */
	public abstract void print();

}
