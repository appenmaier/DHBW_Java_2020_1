package chapter04.exercises.exercise01;

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

	/*
	 * Methoden
	 */
	public void setMake(String m) {
		make = m;
	}

	public void setModel(String m) {
		model = m;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public void accelerate(int s) {
		speed += s;
		System.out.println(make + " " + model + " beschleunigt auf " + speed + "km/h");
	}

	public void brake(int s) {
		speed -= s;
		System.out.println(make + " " + model + " bremst auf " + speed + "km/h ab");
	}

	public int getSpeed() {
		return speed;
	}

	public void print() {
		System.out.println(make + " " + model);
	}

}
