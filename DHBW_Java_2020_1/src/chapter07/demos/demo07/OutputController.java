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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Controller für OutputView.fxml
 * 
 * @author Daniel Appenmaier
 *
 */
public class OutputController implements Initializable {

	/*
	 * Attribute
	 */
	@FXML
	private Label outputLabel;

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
		outputLabel.setText(text);
	}

	public void goToInput(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("InputView.fxml"));
		Scene newScene = new Scene(root);
		Scene currentScene = outputLabel.getScene();
		Stage stage = (Stage) currentScene.getWindow();
		stage.setTitle("Demo 7.7: Eingabe");
		stage.setScene(newScene);
		stage.show();
	}

}
