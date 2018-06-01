/*Write an application that displays the numbers 1 to 4 on the same line, with each pair of
adjacent numbers separated by one space.*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Exercize_2_14 extends Application {
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	public void start(Stage primaryStage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("Exercize_2_14.fxml"));
		primaryStage.setResizable(false);
		primaryStage.sizeToScene();
		primaryStage.setTitle("JavaFX application");
		primaryStage.centerOnScreen();
		//-----------------------------------------------
		Scene s = new Scene(root);
		primaryStage.setScene(s);
		primaryStage.show();
	}
}
