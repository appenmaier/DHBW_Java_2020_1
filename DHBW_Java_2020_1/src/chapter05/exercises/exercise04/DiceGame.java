package chapter05.exercises.exercise04;

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

	/*
	 * Methoden
	 */
	public DiceGame(ArrayList<Player> players) {
		diceCup = new DiceCup();
		dices = new ArrayList<>();
		this.players = players;
		scanner = new Scanner(System.in);
	}

	public void start() {
		boolean loop = true;
		Player bestPlayer = players.get(0);
		while (loop) {
			loop = false;
			for (Player player : players) {
				if (player.isActiv()) {
					move(player);
				}
				if (player.isActiv()) {
					loop = true;
				}
			}
		}
		for (Player player : players) {
			if (player.getScore() > bestPlayer.getScore()) {
				bestPlayer = player;
			}
		}
		System.out
				.println("Der Sieger heißt " + bestPlayer.getName() + " und hat " + bestPlayer.getScore() + " Punkte!");
	}

	private void move(Player player) {
		int input;
		System.out.println(player.getName() + " hat aktuell " + player.getScore() + " Punkte!");
		if (player.getSpecialAvailable()) {
			System.out.print(player.getName() + ", möchtest Du einmalig Spezialwürfel verwenden (1=ja, 2=nein)?: ");
			input = scanner.nextInt();
			if (input == 1) {
				System.out.print(player.getName()
						+ ", welche Spezialwürfel möchtest Du verwenden (1=4-5-6-Würfel, 2=1-2-3-Würfel)?: ");
				input = scanner.nextInt();
				if (input == 1) {
					dices.add(new HighValueDice(4));
					dices.add(new HighValueDice(5));
					dices.add(new HighValueDice(6));
				} else {
					dices.add(new LowValueDice(7));
					dices.add(new LowValueDice(8));
					dices.add(new LowValueDice(9));
				}
				player.setSpecialAvailable(false);
			} else {
				dices.add(new Dice(1));
				dices.add(new Dice(2));
				dices.add(new Dice(3));
			}
		} else {
			dices.add(new Dice(1));
			dices.add(new Dice(2));
			dices.add(new Dice(3));
		}
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
			}
		} else {
			player.setActive(false);
		}
		System.out.println();
		dices.clear();
	}

}
