package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TiePane extends VBox{
	private Text tieText;
	private Button quitButton;

	public	TiePane() {
		// TODO Auto-generated constructor stub
		this.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
		this.setAlignment(Pos.CENTER);
		this.setSpacing(50);
		this.setPrefSize(400, 300);

		this.tieText = new Text();
		this.tieText.setFont(new Font(20));
		this.tieText.setText("Both player have equal total asset --> Tie!!!");
		
		this.quitButton = new Button("Quit Game");
		this.quitButton.setPrefSize(100, 50);
	
		quitButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
				
			}
		});
		
		this.getChildren().addAll(tieText,quitButton);
	}
}
