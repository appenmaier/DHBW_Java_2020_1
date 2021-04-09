package chapter04.exercises.exercise07;

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

	private static int numberOfVehicles;

	/*
	 * Methoden
	 */
	public Vehicle(String make, String model) {
		this.make = make;
		this.model = model;
		numberOfVehicles++;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
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
		System.out.println(make + " " + model);
	}

	public static int getNumberOfVehicles() {
		return numberOfVehicles;
	}

}
