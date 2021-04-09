package chapter04.exercises.exercise14;

import java.util.ArrayList;

public class Exercise0414 {

	public static void main(String[] args) {

		ArrayList<Player> players = new ArrayList<>();

		players.add(new Player("Hans"));
		players.add(new Player("Lisa"));
		players.add(new Player("Peter"));
		DiceGame diceGame = new DiceGame(players);

		diceGame.start();

	}

}
