package chapter06.exercises.exercise01;

import java.util.ArrayList;

/**
 * Fahrzeugvermietung
 * 
 * @author Daniel Appenmaier
 *
 */
public class Rental implements Partner {

	/*
	 * Attribute
	 */
	private String name;
	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	/*
	 * Methoden
	 */
	public Rental(String name) {
		this.name = name;
	}

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void addAllVehicles(Vehicle... vehicles) {
		for (Vehicle v : vehicles) {
			this.vehicles.add(v);
		}
	}

	public void transformAllTrucks() {
		System.out.println();
		for (Vehicle v : vehicles) {
			if (v instanceof Truck) {
				Truck t = (Truck) v; // Downcast
				t.transform();
			}
		}
	}

	public void print() {
		System.out.println(name);
		System.out.println();
		System.out.println("Unsere Fahrzeuge: ");
		for (Vehicle v : vehicles) {
			v.print(); // Polymorphie
		}
	}

}
