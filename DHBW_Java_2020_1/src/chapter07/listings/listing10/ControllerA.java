package chapter07.listings.listing10;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerA {

	@FXML
	Button goToViewBButton;

	public void goToViewB(ActionEvent actionEvent) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("ViewB.fxml"));
		Scene scene = new Scene(root);
		Stage stage = (Stage) goToViewBButton.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

}
