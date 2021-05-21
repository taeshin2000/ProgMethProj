package logic;

import application.GameController;
import main.Main;

public class CheckEndGame {
	
	
	public static void checkEndGame() {
		if (GameController.turnCount == GameController.getMaxGameTurn()) {
			Main.dicePane.getRollButton().setDisable(true);
			int p1Asset = GameController.player1.totalAsset();
			int p2Asset = GameController.player2.totalAsset();
			if(p1Asset == p2Asset ) {
				Main.tiePane.setVisible(true);
			}else if (p1Asset > p2Asset) {
				Main.p1WinPane.setVisible(true);
			}else {
				Main.p2WinPane.setVisible(true);
			}
		}
		if (GameController.winner != 0) {
			Main.dicePane.getRollButton().setDisable(true);
			if (GameController.winner == 1) {
				Main.p1WinPane.setVisible(true);
			}else 
				Main.p2WinPane.setVisible(true);
			}
		}


	
	
	}

