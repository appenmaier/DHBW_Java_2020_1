package chapter04.exercises.exercise15;

/**
 * Kreatur
 * 
 * @author Daniel Appenmaier
 *
 */
public class Creature {

	/*
	 *  Attribute
	 */
	private String name;
	private int attackValue;
	private int hitpoints;

	/*
	 *  Methoden
	 */
	public Creature(String name, int attackValue, int hitpoints) {
		this.name = name;
		this.attackValue = attackValue;
		this.hitpoints = hitpoints;
	}

	public boolean attack(Creature creature) {
		System.out.println(this.name + " greift " + creature.name + " an und erzielt " + this.attackValue + " Schaden!");
		if (this.attackValue >= creature.hitpoints) {
			creature.hitpoints = 0;
			System.out.println(creature.name + " wurde vernichtet!");
			return true;
		} else {
			creature.hitpoints -= this.attackValue;
			System.out.println(creature.name + " hat noch " + creature.hitpoints + " Lebenspunkte!");
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public int getHitpoints() {
		return hitpoints;
	}

	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}

	public void print() {
		System.out.print(name + " (" + attackValue + " - " + hitpoints + ")");
	}

}
