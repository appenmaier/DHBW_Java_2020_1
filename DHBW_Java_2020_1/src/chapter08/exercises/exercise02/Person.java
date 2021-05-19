package chapter08.exercises.exercise02;

import java.io.Serializable;

/**
 * Person
 * 
 * @author Daniel Appenmaier
 *
 */
public class Person implements Serializable {

	/*
	 * Attribute
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private char gender;

	/*
	 * Methoden
	 */
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public void print() {
		System.out.println(name + " - " + age + " - " + gender);
	}

}
