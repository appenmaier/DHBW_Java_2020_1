package chapter07.demos.demo01;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class View {

	/*
	 * Attribute
	 */
	// Bildschirmelemente aka Steuerelemente
	private TextField inputTextField;
	private Button inputToOutputButton;
	private Label outputLabel;
	// Container aka Layout-Manager
	private VBox root;

	/*
	 * Methoden
	 */
	public View() {
		inputTextField = new TextField("Eingabefeld");

		inputToOutputButton = new Button("Eingabe zu Ausgabe");

		outputLabel = new Label("Ausgabefeld");

		root = new VBox();
		root.getChildren().addAll(inputTextField, inputToOutputButton, outputLabel);
	}

	public VBox getRoot() {
		return root;
	}

}
