package chapter07.demos.demo06;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
public class InputController {

	/*
	 * Attribute
	 */
	@FXML
	private TextField inputTextField;

	/*
	 * Methoden
	 */
	public void goToOutput(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("OutputView.fxml"));
		Scene newScene = new Scene(root);
		Scene currentScene = inputTextField.getScene();
		Stage stage = (Stage) currentScene.getWindow();
		stage.setTitle("Demo 7.6: Ausgabe");
		stage.setScene(newScene);
		stage.show();
	}

}
