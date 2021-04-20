package chapter05.exercises.exercise06;

/**
 * Fahrzeug
 * 
 * @author Daniel Appenmaier
 *
 */
public abstract class Vehicle {

	/*
	 * Attribute
	 */
	private String make;
	private String model;
	protected int speed;
	private Engine engine;

	private static int numberOfVehicles;

	/*
	 * Methoden
	 */
	public Vehicle(String make, String model, Engine engine) {
		this.make = make;
		this.model = model;
		this.engine = engine;
		numberOfVehicles++;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public Engine getEngine() {
		return engine;
	}

	public final void accelerate(int speed) {
		this.speed += speed;
		System.out.println(make + " " + model + " beschleunigt auf " + this.speed + "km/h");
	}

	public final void brake(int speed) {
		this.speed -= speed;
		System.out.println(make + " " + model + " bremst auf " + this.speed + "km/h ab");
	}

	public int getSpeed() {
		return speed;
	}

	public abstract void print();

	public static int getNumberOfVehicles() {
		return numberOfVehicles;
	}

}
