package chapter04.exercises.exercise15;

public class Exercise0415 {

	public static void main(String[] args) {

		Creature zombie = new Creature("Zombie", 2, 10);
		Creature vampire = new Creature("Vampir", 4, 6);

		CreatureGame creatureGame = new CreatureGame(zombie, vampire);
		creatureGame.simulateFight();

	}

}
