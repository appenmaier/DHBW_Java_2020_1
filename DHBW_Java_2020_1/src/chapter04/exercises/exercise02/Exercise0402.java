package chapter04.exercises.exercise02;

public class Exercise0402 {

	public static void main(String[] args) {

		Vehicle v = new Vehicle("Porsche", "911");

		v.accelerate(20);
		v.accelerate(40);
		int speed = v.getSpeed();
		System.out.println(v.getSpeed());
		v.brake(10);
		v.brake(50);
		v.print();

	}

}
