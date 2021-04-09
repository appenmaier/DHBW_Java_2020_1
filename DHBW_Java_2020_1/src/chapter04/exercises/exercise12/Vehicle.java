package chapter04.exercises.exercise12;

/**
 * Fahrzeug
 * 
 * @author Daniel Appenmaier
 *
 */
public class Vehicle {

	/*
	 * Attribute
	 */
	private String make;
	private String model;
	private int speed;
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

	public void accelerate(int speed) {
		this.speed += speed;
		System.out.println(make + " " + model + " beschleunigt auf " + this.speed + "km/h");
	}

	public void brake(int speed) {
		this.speed -= speed;
		System.out.println(make + " " + model + " bremst auf " + this.speed + "km/h ab");
	}

	public int getSpeed() {
		return speed;
	}

	public void print() {
		System.out.println(make + " " + model + " (" + engine.getDescription() +")");
	}

	public static int getNumberOfVehicles() {
		return numberOfVehicles;
	}

}
