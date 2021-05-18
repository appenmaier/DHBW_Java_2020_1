package chapter07.exercises.exercise05;

/**
 * Model für Exercise0705
 * 
 * @author Daniel Appenmaier
 *
 */
public class Model {

	/*
	 * Attribute
	 */
	private static Model instance;
	private User user;

	/*
	 * Methoden
	 */
	private Model() {
	}

	public static Model getInstance() {
		if (instance == null) {
			instance = new Model();
		}
		return instance;
	}

	public void setUser(String userName, String password) {
		user = new User(userName, password);
	}

	public String getUserName() {
		return user.getUserName();
	}

}
