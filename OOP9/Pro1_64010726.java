import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;

public class Pro1_64010726 extends Application {

	TextField tfLoanAmount = new TextField();
	TextField tfNumberOfYears = new TextField();
	TextArea textArea = new TextArea();

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		tfNumberOfYears.setPrefColumnCount(2);
		tfLoanAmount.setPrefColumnCount(7);

		Button btShowTable = new Button("Show Table");
		btShowTable.setOnAction((e) -> print());

		HBox topBox = new HBox(10);
		topBox.getChildren().addAll(new Label("Loan Amount"), tfLoanAmount, new Label("Number of Years"),
				tfNumberOfYears, btShowTable);
		topBox.setAlignment(Pos.CENTER);

		BorderPane pane = new BorderPane();
		pane.setTop(topBox);
		pane.setCenter(textArea);

		Scene scene = new Scene(pane);

		primaryStage.setTitle("Loan GUI");

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	void print() {
		String output = "";
		double monthlyInterestRate; // Monthly interest rate
		double monthlyPayment; // Monthly payment

		output += "Interest Rate       Monthly Payment          Total Payment\n";

		for (double i = 5.0; i <= 8; i += 0.25) {
			monthlyInterestRate = i / 1200;
			monthlyPayment = Double.parseDouble(tfLoanAmount.getText()) *
					monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate,
							Double.parseDouble(tfNumberOfYears.getText()) * 12));

			output += String.format("%-24.3f%-34.2f%-8.2f\n", i,
					monthlyPayment, (monthlyPayment * 12) *
							Double.parseDouble(tfNumberOfYears.getText()));
		}
		textArea.setText(output);
	}

	public static void main(String[] args) {
		launch(args);
	}
}