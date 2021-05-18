package chapter07.exercises.exercise05;

/**
 * Anwender
 * 
 * @author Daniel Appenmaier
 *
 */
public class User {

	/*
	 * Attribute
	 */
	private String userName;
	private String password;

	/*
	 * Methoden
	 */
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}
