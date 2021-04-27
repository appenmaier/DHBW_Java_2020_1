package chapter07.demos.demo04;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements Initializable {

	@FXML
	private ImageView javaFxImageView;

	public void initialize(URL location, ResourceBundle resources) {
		Image image = new Image(getClass().getResourceAsStream("/resources/misc/javafx.PNG"));
		javaFxImageView.setImage(image);
	}

}
