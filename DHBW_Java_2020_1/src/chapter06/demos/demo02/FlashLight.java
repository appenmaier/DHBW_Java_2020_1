package chapter06.demos.demo02;

/**
 * Taschenlampe
 * 
 * @author Daniel Appenmaier
 *
 */
public final class FlashLight extends Light {

	/*
	 * Methoden
	 */
	public FlashLight() {
		super();
	}

	/**
	 * schaltet die Taschenlampe ein
	 */
	@Override
	public void switchOn() {
		isOn = true;
		isShining = true;
	}

	// Light.switchOff: finale Methode
	// public void switchOff() {
	// isOn = false;
	// isShining = false;
	// }

	/**
	 * gibt alle Attribute der Taschenlampe auf der Konsole aus
	 */
	@Override
	public void print() {
		System.out.println("Eingeschaltet?: " + isOn);
		System.out.println("Leuchtet?: " + isShining);
		System.out.println("Ich bin eine Taschenlampe");
		System.out.println();
	}

}
