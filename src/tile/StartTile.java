package tile;

import application.GameController;
import application.InitialBoard;
import logic.Player;
import main.Main;

public class StartTile extends SpacialTile {
	
	public StartTile(String name,int position) {
		super(name,position);
		
	}
	@Override
	public void interact(Player player,InitialBoard board) {
		// TODO Auto-generated method stub
		Main.player1Pane.updatePlayerPane(1);
		Main.player2Pane.updatePlayerPane(2);
		GameController.increaseTurnCount();
		if (!Main.skipTurn) {
			GameController.turn.changeCurrentPlayer(GameController.player1, GameController.player2);
			Main.player1Pane.updatePlayerPaneScreen();
			Main.player2Pane.updatePlayerPaneScreen();
			
		}else {
			Main.skipTurn = false;
		}
		Main.dicePane.getRollButton().setDisable(false);
		
	}

}
