package chapter07.demos.demo04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Bilderrahmen, Rastercontainer und Bereichscontainer
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0704 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Demo 7.4");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
