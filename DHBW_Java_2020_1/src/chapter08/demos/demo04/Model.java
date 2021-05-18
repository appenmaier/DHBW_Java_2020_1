package chapter08.demos.demo04;

/**
 * Model für Demo0804
 * 
 * @author Daniel Appenmaier
 *
 */
public class Model {

	/*
	 * Attribute
	 */
	private static Model instance;


	/*
	 * Methoden
	 */
	private Model() {
	}

	public static Model getInstance() {
		if (instance == null) {
			instance = new Model();
		}
		return instance;
	}

	public void createLogEntry(String content) {
	}

	public void printLogEntries() {
	}

}
