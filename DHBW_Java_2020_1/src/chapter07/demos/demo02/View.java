package chapter07.demos.demo02;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class View {

	/*
	 * Attribute
	 */
	// Controls
	private TextField inputTextField;
	private Button inputToOutputButton;
	private Label outputLabel;
	// Container
	private VBox root;

	/*
	 * Methoden
	 */
	public View() {
		inputTextField = new TextField();
		inputTextField.setPromptText("Eingabe");

		inputToOutputButton = new Button("Eingabe zu Ausgabe");
		inputToOutputButton.setOnAction(new Controller(this));

		outputLabel = new Label("Ausgabe");

		root = new VBox();
		root.getChildren().addAll(inputTextField, inputToOutputButton, outputLabel);
	}

	public VBox getRoot() {
		return root;
	}

	public TextField getInputTextField() {
		return inputTextField;
	}

	public Button getInputToOutputButton() {
		return inputToOutputButton;
	}

	public Label getOutputLabel() {
		return outputLabel;
	}

}
