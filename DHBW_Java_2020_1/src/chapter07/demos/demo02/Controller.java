package chapter07.demos.demo02;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements EventHandler<ActionEvent> {

	/*
	 * Attribute
	 */
	private View view;

	/*
	 * Methoden
	 */
	public Controller(View view) {
		this.view = view;
	}

	@Override
	public void handle(ActionEvent event) { // Ereignis behandlen
		// Eingabefeld der View auslesen
		TextField inputTextField = view.getInputTextField();
		String text = inputTextField.getText();
		// Ausgabefeld der View ändern
		Label outputLabel = view.getOutputLabel();
		outputLabel.setText(text);
	}

}
