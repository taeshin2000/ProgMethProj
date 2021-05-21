package gui.onebuttonpane;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class Base_OneButtonPane extends VBox{
	private Text displayText;
	private Button okButton;
	
	public Base_OneButtonPane(String display,Color bgColor) {
		this.setBackground(new Background(new BackgroundFill(bgColor, null, null)));
		this.setAlignment(Pos.CENTER);
		this.setSpacing(50);
		this.setPrefSize(400, 300);
		
		displayText = new Text();
		setDisplayText(display);
		
		okButton = new Button("OK");
		okButton.setPrefSize(100, 50);
		
		this.getChildren().addAll(displayText,okButton);
	}

	public void setDisplayText(String newText) {
		this.displayText.setFont(new Font(20));
		this.displayText.setText(newText);
	}
	
	public void setOKButtonText(String newText) {
		this.okButton.setText(newText);
	}
	
	public Button getOKButton() {
		return okButton;
	}
}
