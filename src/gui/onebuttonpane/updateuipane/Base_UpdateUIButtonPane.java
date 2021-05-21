package gui.onebuttonpane.updateuipane;

import application.GameController;
import gui.onebuttonpane.Base_OneButtonPane;
import javafx.scene.paint.Color;
import main.Main;

public abstract class Base_UpdateUIButtonPane extends Base_OneButtonPane{

	public Base_UpdateUIButtonPane(String display, Color bgColor) {
		super(display, bgColor);
	}

	public void updateUI() {
		Main.dicePane.getRollButton().setDisable(false);
		Main.player1Pane.updatePlayerPane(1);
		Main.player2Pane.updatePlayerPane(2);
		GameController.increaseTurnCount();
		Main.dicePane.updateDicePaneScreen();
		if (!Main.skipTurn) {
			GameController.turn.changeCurrentPlayer(GameController.player1, GameController.player2);
			Main.player1Pane.updatePlayerPaneScreen();
			Main.player2Pane.updatePlayerPaneScreen();

		} else {
			Main.skipTurn = false;
		}
	}
}
