import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Racing_car extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        CarPane pane = new CarPane();

        pane.setOnMousePressed(e -> pane.pause());
		pane.setOnMouseReleased(e -> pane.play());
        pane.setOnKeyPressed(new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent e) {
                if (e.getCode() == KeyCode.UP) {
                    pane.increaseSpeed();
                }
                else if (e.getCode() == KeyCode.DOWN) {
                    pane.decreaseSpeed();
                }
            }
        });

        Scene scene = new Scene(pane, 600, 100);
		primaryStage.setTitle("Racing_car"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		pane.requestFocus(); // Request focus

    }
}