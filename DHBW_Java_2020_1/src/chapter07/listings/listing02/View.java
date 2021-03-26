package chapter07.listings.listing02;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class View {

	private TextField textField;
	private Button button;
	private Label label;

	public View() {
		textField = new TextField();
		textField.setPromptText("Eingabefeld");

		button = new Button("Drucktaste");

		label = new Label("Ausgabefeld");
	}

	public TextField getTextField() {
		return textField;
	}

	public Button getButton() {
		return button;
	}

	public Label getLabel() {
		return label;
	}

}
