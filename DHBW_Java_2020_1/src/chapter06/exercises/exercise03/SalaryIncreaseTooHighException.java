package chapter06.exercises.exercise03;

public class SalaryIncreaseTooHighException extends Exception {

	public SalaryIncreaseTooHighException() {
		super("Die Gehaltserhöhung überschreitet 10%");
	}

}
