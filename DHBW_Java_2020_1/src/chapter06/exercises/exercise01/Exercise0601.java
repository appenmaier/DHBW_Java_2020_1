package chapter06.exercises.exercise01;

public class Exercise0601 {

	public static void main(String[] args) {

		Car car = new Car("Porsche", "911", Engine.ELECTRO, 2);

		try {
			car.accelerate(0);
			car.brake(10);
		} catch (InvalidValueException e) {
			System.out.println(e.getMessage());
		}

	}

}
