package chapter07.listings.listing12;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class OutputViewController implements Initializable {

	@FXML
	Button goToInputView;
	@FXML
	Label output;

	Model model = Model.getInstance();

	public void initialize(URL location, ResourceBundle resources) {
		output.textProperty().bind(model.getText());
	}

	public void goToInputView(ActionEvent actionEvent) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("InputView.fxml"));
		Scene scene = new Scene(root);
		Stage stage = (Stage) goToInputView.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

}
