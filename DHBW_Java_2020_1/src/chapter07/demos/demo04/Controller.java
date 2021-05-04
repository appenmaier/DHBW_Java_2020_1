package chapter07.demos.demo04;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Controller für View.fxml
 * 
 * @author Daniel Appenmaier
 *
 */
public class Controller implements Initializable {

	/*
	 * Attribute
	 */
	@FXML
	private ImageView javaFxImageView;

	/*
	 * Methoden
	 */
	public void initialize(URL location, ResourceBundle resources) {
		Image image = new Image(getClass().getResourceAsStream("/resources/misc/javafx.PNG"));
		javaFxImageView.setImage(image);
	}

}
