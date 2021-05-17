package gui.pane;

import gui.PlayerDisplay;
import javafx.scene.layout.VBox;

public class PlayerPane extends VBox {

	PlayerDisplay player1Display;
	PlayerDisplay player2Display;
	
	public PlayerPane() {
		player1Display = new PlayerDisplay(1);
		player2Display = new PlayerDisplay(2);
		this.getChildren().addAll(player1Display,player2Display);
		this.setLayoutX(890);
		this.setLayoutY(225);
		
		/* TODO Initialise Text Here*/
		player1Display.updateTextPlayerName("Prayuth");
		player1Display.updatePlayerPrice(500000);
		player1Display.setCurrentPlayer();
		
		player2Display.updateTextPlayerName("Prawit");
		player2Display.updateTextPlayerPrice("25k");
		
		
	}
	
}
