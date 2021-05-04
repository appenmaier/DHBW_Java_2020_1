package chapter07.demos.demo06;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Controller für OutputView.fxml
 * 
 * @author Daniel Appenmaier
 *
 */
public class OutputController {

	/*
	 * Attribute
	 */
	@FXML
	private Label outputLabel;

	@FXML
	private Button goToInputButton;

	/*
	 * Methoden
	 */
	public void goToInput(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("InputView.fxml"));
		Scene newScene = new Scene(root);
		Scene currentScene = goToInputButton.getScene();
		Stage stage = (Stage) currentScene.getWindow();
		stage.setTitle("Demo 7.6: Eingabe");
		stage.setScene(newScene);
		stage.show();
	}

}
