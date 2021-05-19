package chapter08.exercises.exercise03;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Exercise0803 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Exercise 8.3");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
