package gui;

import application.GameController;
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
import main.Main;

public class GetItemPane extends VBox {
	Text text;
	Button okButton;
	
	public GetItemPane() {
		// TODO Auto-generated constructor stub
		this.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
		this.setAlignment(Pos.CENTER);
		this.setPrefSize(400, 200);
		this.setSpacing(50);
		
		this.okButton = new Button("OK");
		this.okButton.setPrefSize(100, 50);
		
		text = new Text();
		text.setText("");
		text.setFont(new Font(20));
		
		okButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Main.getItemPane.setVisible(false);
				Main.dicePane.getRollButton().setDisable(false);
				GameController.increaseTurnCount();
				Main.dicePane.updateDicePaneScreen();
				if (!Main.skipTurn) {
					GameController.turn.changeCurrentPlayer(GameController.player1, GameController.player2);
					Main.player1Pane.updatePlayerPaneScreen();
					Main.player2Pane.updatePlayerPaneScreen();
					
				}else {
					Main.skipTurn = false;
				}

				
			}
		});
		
		this.getChildren().addAll(text,okButton);
		
		
	}
	
	public void updateGetItemPaneScreen(String text1) {
		this.text.setText(text1);
	}
}
