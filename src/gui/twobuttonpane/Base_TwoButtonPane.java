package gui.twobuttonpane;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class Base_TwoButtonPane extends VBox{
	Text displayText;
	Button interactButton;
	Button noButton;
	
	public Base_TwoButtonPane() {
		this.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
		this.setAlignment(Pos.CENTER);
		this.setSpacing(20);
		this.setPrefSize(400, 200);
		
		interactButton = new Button();
		interactButton.setPrefSize(100, 50);
		interactButton.setFont(new Font(20));

		noButton = new Button("No");
		noButton.setPrefSize(100, 50);
		noButton.setFont(new Font(20));
		
		displayText = new Text();
		displayText.setFont(new Font(20));
		this.getChildren().addAll(displayText, interactButton, noButton);
	}
	
	public void setDisplayText(String newText) {
		this.displayText.setText(newText);
	}
	
	public void setInteractButtonText(String newText) {
		this.interactButton.setText(newText);
	}
	
	public Button getInteractButton() {
		return interactButton;
	}
	
	public void setNoButtonText(String newText) {
		this.noButton.setText(newText);
	}
	
	public Button getNoButton() {
		return noButton;
	}
	
}
