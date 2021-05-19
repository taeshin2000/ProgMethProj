package itemcard;

import gui.GetItemPane;
import logic.Player;
import main.Main;

public class LoseMoneyCard extends InstantUseCard {

	public LoseMoneyCard(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void active(Player player) {
		if (player.getMoney() > 20000) {
			player.decreaseMoney(20000);
			Main.getItemPane.updateGetItemPaneScreen("You get a lose money card and lose 20000");
			Main.player1Pane.updatePlayerPane(1);
			Main.player2Pane.updatePlayerPane(2);
			Main.getItemPane.setVisible(true);
		}else {
			player.setMoney(0);
			Main.getItemPane.updateGetItemPaneScreen("You get a lose money card and lose all of your money");
			Main.player1Pane.updatePlayerPane(1);
			Main.player2Pane.updatePlayerPane(2);
			Main.getItemPane.setVisible(true);
		
		}
	}

}
