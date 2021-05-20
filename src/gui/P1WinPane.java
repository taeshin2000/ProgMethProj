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

public class P1WinPane extends VBox {
	private Text winText;
	private Button quitButton;

	public	P1WinPane() {
		// TODO Auto-generated constructor stub
		this.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
		this.setAlignment(Pos.CENTER);
		this.setSpacing(50);
		this.setPrefSize(400, 300);

		this.winText = new Text();
		this.winText.setFont(new Font(25));
		this.winText.setText("Player1 Wins!!!");
		
		this.quitButton = new Button("Quit Game");
		this.quitButton.setPrefSize(100, 50);
	
		quitButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
				
			}
		});
		this.getChildren().addAll(winText,quitButton);
	}
}
