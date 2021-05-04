package chapter07.demos.demo07;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Controller für InputView.fxml
 * 
 * @author Daniel Appenmaier
 *
 */
public class InputController implements Initializable {

	/*
	 * Attribute
	 */
	@FXML
	private TextField inputTextField;

	private Model model;

	/*
	 * Methoden
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Model initialisieren
		model = Model.getInstance();
		
		// Eingabe-Text aus dem Model lesen
		String text = model.getText();
		inputTextField.setText(text);
	}

	public void goToOutput(ActionEvent event) throws IOException {
		// Eingabe-Text im Model speichern
		String text = inputTextField.getText();
		model.setText(text);

		// Szene wechseln
		Parent root = FXMLLoader.load(getClass().getResource("OutputView.fxml"));
		Scene newScene = new Scene(root);
		Scene currentScene = inputTextField.getScene();
		Stage stage = (Stage) currentScene.getWindow();
		stage.setTitle("Demo 7.7: Ausgabe");
		stage.setScene(newScene);
		stage.show();
	}

}
