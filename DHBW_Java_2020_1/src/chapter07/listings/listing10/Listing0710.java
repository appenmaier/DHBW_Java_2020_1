package chapter07.listings.listing10;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Listing0710 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("ViewA.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Listing 2.10");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
