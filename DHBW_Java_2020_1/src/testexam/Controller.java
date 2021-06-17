package testexam;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

	@FXML
	private TextField descriptionTextField;

	@FXML
	private TextField genreDescriptionTextField;

	@FXML
	private TextField publishingYearTextField;

	private Model model;

	public void initialize(URL location, ResourceBundle resources) {
		model = Model.getInstance();
	}

	public void addMovie() {
		String description = descriptionTextField.getText();
		String genreDescription = genreDescriptionTextField.getText();
		String publishingYear = publishingYearTextField.getText();
		/*
		 * Erweiterung
		 */
		try {
			model.addMovie(description, genreDescription, publishingYear);
		} catch (Exception e) {
			Alert alert = new Alert(AlertType.ERROR, e.getMessage());
			alert.show();
		}
		/*
		 * Erweiterung
		 */
	}

}
