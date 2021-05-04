package chapter07.demos.demo07;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Kommunikation zwischen Szenen
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0707 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("InputView.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Demo 7.7: Eingabe");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
