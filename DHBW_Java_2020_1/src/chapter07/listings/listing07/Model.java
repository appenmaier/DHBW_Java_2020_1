package chapter07.listings.listing07;

public class Model {

	private static Model instance;
	private String text;	

	private Model() {

	}

	public static Model getInstance() {
		if (instance == null) {
			instance = new Model();
		}
		return instance;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

}
