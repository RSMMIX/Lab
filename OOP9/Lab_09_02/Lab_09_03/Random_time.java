import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Random_time extends Application {


	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
        ClockPane clockpane = new ClockPane((int)(Math.random() * 12), (int)(Math.random() * 31), (int)(Math.random() * 60));
		
        Scene scene = new Scene(clockpane,250,250);
        clockpane.setSecondHandVisible(false);
        
		primaryStage.setTitle("Clock");

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}