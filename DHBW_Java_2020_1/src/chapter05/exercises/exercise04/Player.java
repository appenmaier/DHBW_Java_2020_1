package chapter05.exercises.exercise04;

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
	private boolean isActive;
	private boolean specialAvailable;

	/*
	 * Methoden
	 */
	public Player(String name) {
		this.name = name;
		score = 0;
		isActive = true;
		specialAvailable = true;
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

	public boolean isActiv() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getSpecialAvailable() {
		return specialAvailable;
	}

	public void setSpecialAvailable(boolean specialAvailable) {
		this.specialAvailable = specialAvailable;
	}

}
