package chapter07.listings.listing05;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class View {

	private TextField textField;
	private Button button;
	private Label label;
	private VBox root;

	public View() {
		textField = new TextField();
		textField.setPromptText("Eingabefeld");

		button = new Button("Drucktaste");
		button.setOnAction(new Controller(this));

		label = new Label("Ausgabefeld");
		label.setStyle("-fx-text-fill: rgb(0,0,255);");

		root = new VBox();
		root.getChildren().add(textField);
		root.getChildren().add(button);
		root.getChildren().add(label);
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

	public VBox getRoot() {
		return root;
	}

}
