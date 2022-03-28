import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;

public class Display_random extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                TextField text = new TextField(String.valueOf((int) (Math.random() * 2)));
                text.setAlignment(Pos.CENTER);
                pane.add(text, i, j);
            }
        }
        Scene scene = new Scene(pane, 235, 255);
        primaryStage.setTitle("Display_random");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}