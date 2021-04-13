package chapter05.demos.demo01;

/**
 * Taschenlampe
 * 
 * @author Daniel Appenmaier
 *
 */
public class FlashLight extends Light {

	/*
	 * Methoden
	 */
	public FlashLight() {
		super();
	}

	/**
	 * gibt alle Attribute der Taschenlampe auf der Konsole aus
	 */
	@Override
	public void print() {
		super.print();
		System.out.println("Ich bin eine Taschenlampe");
	}

}
