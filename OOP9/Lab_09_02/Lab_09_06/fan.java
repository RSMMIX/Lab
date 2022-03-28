import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;

public class fan extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override 
	public void start(Stage primaryStage) {
		Button btPause = new Button("Pause");
		Button btResume = new Button("Resume");
		Button btReverse = new Button("Reverse");

		HBox paneForButtons = new HBox(5);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.getChildren().addAll(btPause, btResume, btReverse);

		FanPane fan = new FanPane();
		btPause.setOnAction(e -> {
			fan.pause();
		});

		btResume.setOnAction(e -> {
			fan.play();
		});

		btReverse.setOnAction(e -> {
			fan.reverse();
		});
		Slider slider = new Slider(1,5,1);
		slider.setOnMouseDragged(e->fan.setSpeed(slider.getValue()));
		slider.setOnMouseClicked(e->fan.setSpeed(slider.getValue()));

		BorderPane pane = new BorderPane();
		pane.setTop(paneForButtons);
		pane.setCenter(fan);
		pane.setBottom(slider);
		

		Scene scene = new Scene(pane, 250, 260);
		primaryStage.setTitle("running fan"); 
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
}