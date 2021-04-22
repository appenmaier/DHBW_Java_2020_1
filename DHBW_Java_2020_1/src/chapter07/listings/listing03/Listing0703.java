package chapter07.listings.listing03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Listing0703 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
		View view = new View();
		Scene scene = new Scene(view.getRoot());
		primaryStage.setTitle("Listing 7.3");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
