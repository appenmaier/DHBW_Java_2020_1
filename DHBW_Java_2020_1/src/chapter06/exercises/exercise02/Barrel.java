package chapter06.exercises.exercise02;

/**
 * Fass
 * 
 * @author Daniel Appenmaier
 *
 */
public class Barrel {

	/*
	 * Attribute
	 */
	private int capacity;
	private int fluidLevel;

	/*
	 * Methoden
	 */
	public Barrel(int capacity) {
		this.capacity = capacity;
	}

	public void addFluid(int amount) throws BarrelOverflowException {
		if (fluidLevel + amount > capacity) {
			fluidLevel = capacity;
			throw new BarrelOverflowException();
		}
		fluidLevel += amount;
	}

	public void displayFluidLevel() {
		System.out.println("Füllstand: " + fluidLevel);
	}

}
