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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InputViewController implements Initializable {

	@FXML
	Button goToOutputView;
	@FXML
	TextField input;

	Model model = Model.getInstance();

	public void initialize(URL location, ResourceBundle resources) {
		input.textProperty().bindBidirectional(model.getText());
	}

	public void goToOutputView(ActionEvent actionEvent) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("OutputView.fxml"));
		Scene scene = new Scene(root);
		Stage stage = (Stage) goToOutputView.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

}
