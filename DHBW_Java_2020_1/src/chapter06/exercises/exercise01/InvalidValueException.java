package chapter06.exercises.exercise01;

public class InvalidValueException extends Exception {

	public InvalidValueException() {
		super("Ungültiger Wert");
	}

	public InvalidValueException(int value) {
		super("Ungültiger Wert: " + value);
	}

	public InvalidValueException(String message) {
		super(message);
	}

}
