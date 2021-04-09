package chapter04.exercises.exercise13;

/**
 * Spieler
 * 
 * @author Daniel Appenmaier
 *
 */
public class Player {

	/*
	 * Attribute
	 */
	private String name;
	private int score;

	/*
	 * Methoden
	 */
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
