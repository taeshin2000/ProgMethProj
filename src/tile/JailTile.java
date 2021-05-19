package tile;

import application.GameController;
import application.InitialBoard;
import logic.Player;
import main.Main;

public class JailTile extends SpacialTile {

	public JailTile(String name,int position) {
		super(name,position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interact(Player player,InitialBoard board) {
		GameController.turn.changeCurrentPlayer(GameController.player1, GameController.player2);
		Main.skipTurn = true;
		Main.player1Pane.updatePlayerPaneScreen();
		Main.player2Pane.updatePlayerPaneScreen();
		Main.dicePane.getRollButton().setDisable(false);
		GameController.increaseTurnCount();
		Main.dicePane.updateDicePaneScreen();
	}

}
