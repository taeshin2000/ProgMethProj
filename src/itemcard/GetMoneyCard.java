package itemcard;

import logic.Player;
import main.Main;

public class GetMoneyCard extends InstantUseCard {

	public GetMoneyCard(String name) {
		super(name);
	}

	@Override
	public void active(Player player) {
		player.increaseMoney(20000);
		Main.getItemPane.updateGetItemPaneScreen("You get a money card and gain 20000");
		Main.player1Pane.updatePlayerPane(1);
		Main.player2Pane.updatePlayerPane(2);
		Main.getItemPane.setVisible(true);
	}
	

}
