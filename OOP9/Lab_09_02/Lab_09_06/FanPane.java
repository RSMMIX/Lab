import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;

public class FanPane extends Pane {
	private double startAngle = 15;
	private Timeline fan;

	public FanPane() {
		Circle circle = new Circle(125, 115, 100);
		circle.setStroke(Color.RED);
		circle.setFill(Color.WHITE);
		getChildren().add(circle);
		double angle = 0;
		for (int i = 0; i < 4; i++) {
			Arc arc = new Arc(125, 115, 90, 90, angle + 90, 50);
			arc.setFill(Color.BLACK);
			arc.setType(ArcType.ROUND);
			getChildren().add(arc);
			angle += 90;
		}

		fan = new Timeline(new KeyFrame(Duration.millis(50), e -> spinFan()));
		fan.setCycleCount(Timeline.INDEFINITE);
		fan.play(); // Start animation
		
	}
    
	protected void spinFan() {
		for (int i = 1; i < getChildren().size(); i++) {
			Arc a = (Arc)getChildren().get(i);
			a.setStartAngle(a.getStartAngle() + startAngle);
		}
	}

    public void setSpeed(double spd){
        fan.setRate(spd);
    }

	/** Pause animation */
	public void pause() {
		fan.pause();
	}

	/** Resume animation */
	public void play() {
		fan.play();
	}

	/** Reverse the direction of fan spin */
	protected void reverse() {
		startAngle *= -1;
	}
}