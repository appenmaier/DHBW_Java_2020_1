package chapter04.exercises.exercise14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Würfelspiel
 * 
 * @author Daniel Appenmaier
 *
 */
public class DiceGame {

	/*
	 * Attribute
	 */
	private DiceCup diceCup;
	private ArrayList<Dice> dices;
	private ArrayList<Player> players;
	private Scanner scanner;
	private int noActivePlayers;

	/*
	 * Methoden
	 */
	public DiceGame(ArrayList<Player> players) {
		diceCup = new DiceCup();
		dices = new ArrayList<>();
		this.players = players;
		scanner = new Scanner(System.in);
		noActivePlayers = players.size();
	}

	public void start() {
		Player bestPlayer = players.get(0);
		while (noActivePlayers > 1) {
			for (Player player : players) {
				if (player.isActiv() && noActivePlayers > 1) {
					move(player);
				}
			}
		}
		for (Player player : players) {
			if (player.getScore() > bestPlayer.getScore() && player.isActiv()) {
				bestPlayer = player;
			}
		}
		System.out
				.println("Der Sieger heißt " + bestPlayer.getName() + " und hat " + bestPlayer.getScore() + " Punkte!");
	}

	private void move(Player player) {
		int input;
		dices.add(new Dice(1));
		dices.add(new Dice(2));
		dices.add(new Dice(3));
		System.out.println(player.getName() + " hat aktuell " + player.getScore() + " Punkte!");
		System.out.print(player.getName() + ", möchtest Du würfeln (1=ja, 2=nein)?: ");
		input = scanner.nextInt();
		if (input == 1) {
			diceCup.rollTheDices(dices);
			int score = 0;
			for (Dice dice : dices) {
				score += dice.getValue();
			}
			System.out.println(player.getName() + " hat " + score + " Punkte!");
			player.setScore(player.getScore() + score);
			System.out.println(player.getName() + " hat insgesamt " + player.getScore() + " Punkte!");
			if (player.getScore() > 50) {
				System.out.println(player.getName() + " hat verloren!");
				player.setScore(0);
				player.setActive(false);
				noActivePlayers--;
			}
		} else {
			player.setActive(false);
			noActivePlayers--;
		}
		System.out.println();
		dices.clear();
	}

}
