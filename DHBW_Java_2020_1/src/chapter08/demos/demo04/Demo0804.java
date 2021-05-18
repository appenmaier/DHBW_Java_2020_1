package chapter08.demos.demo04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Zeichenorientiertes Lesen und Schreiben von Objekten
 * 
 * @author appenmaier
 *
 */
public class Demo0804 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void init() {
		Model model = Model.getInstance();
		model.initLogFile();
	}
	
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Demo 8.4");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void stop() {
		Model model = Model.getInstance();
		model.saveLog();
	}

}
