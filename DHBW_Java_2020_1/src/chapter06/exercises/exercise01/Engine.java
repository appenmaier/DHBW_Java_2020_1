package chapter06.exercises.exercise01;

/**
 * Motor
 * 
 * @author Daniel Appenmaier
 *
 */
public enum Engine {

	/*
	 * Aufzählungskonstanten
	 */
	DIESEL("Diesel"), PETROL("Benzin"), GAS("Autogas"), ELECTRO("Elektro");

	/*
	 * Attribute
	 */
	private String description;

	/*
	 * Methoden
	 */
	Engine(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
