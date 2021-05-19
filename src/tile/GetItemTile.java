package tile;

import java.util.ArrayList;

import application.GameController;
import application.InitialBoard;
import application.ItemList;
import itemcard.GetMoneyCard;
import itemcard.ItemCard;
import itemcard.LoseMoneyCard;
import itemcard.ProtectionCard;
import itemcard.UseLaterCard;
import logic.Player;
import main.Main;

public class GetItemTile extends SpacialTile {

	private ItemList items = new ItemList();

	public GetItemTile(String name, int position) {
		super(name, position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interact(Player player, InitialBoard board) {
		ItemCard card = items.randomItem();
		if (card instanceof GetMoneyCard) {
			((GetMoneyCard) card).active(player);

		} else if (card instanceof LoseMoneyCard) {
			((LoseMoneyCard) card).active(player);
		}

		else if (card instanceof ProtectionCard) {
			if (!player.getHaveProtectionCard()) {
				player.setProtectionCard(true);
				Main.getItemPane.updateGetItemPaneScreen("You get a protection card");
				Main.player1Pane.updatePlayerPane(1);
				Main.player2Pane.updatePlayerPane(2);
				Main.getItemPane.setVisible(true);
				

			} else {
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

	}
}
