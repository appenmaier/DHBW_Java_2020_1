package chapter04.exercises.exercise01;

public class Exercise0401 {

	public static void main(String[] args) {

		Vehicle v = new Vehicle();

		v.setMake("Porsche");
		v.setModel("911");
		v.accelerate(20);
		v.accelerate(40);
		int speed = v.getSpeed();
		System.out.println(v.getSpeed());
		v.brake(10);
		v.brake(50);
		v.print();

	}

}
