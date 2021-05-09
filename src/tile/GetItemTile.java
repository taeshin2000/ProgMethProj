package tile;

import java.util.ArrayList;

import application.InitialBoard;
import application.ItemList;
import itemcard.DiceControllCard;
import itemcard.GetMoneyCard;
import itemcard.ItemCard;
import itemcard.LoseMoneyCard;
import itemcard.ProtectionCard;
import itemcard.UseLaterCard;
import logic.Player;

public class GetItemTile extends SpacialTile {
	
	private ItemList items  = new ItemList();

	public GetItemTile(String name,int position) {
		super(name,position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interact(Player player,InitialBoard board) {
		ItemCard card = items.randomItem();
		System.out.println("You get a " + card.getName());
		if (card instanceof GetMoneyCard) {
			((GetMoneyCard)card).active(player);
			
		}
		else if (card instanceof LoseMoneyCard) {
			((LoseMoneyCard)card).active(player);
		}
		else if (card instanceof DiceControllCard) {
			if (!player.getHaveDiceControllCard() && !player.getHaveProtectionCard()) {
				player.setDiceControllCard(true);
			}else {
				System.out.println("You already have an item card!!!");
			}
			
		}
		
		else if (card instanceof ProtectionCard) {
			if (!player.getHaveDiceControllCard() && !player.getHaveProtectionCard()) {
				player.setProtectionCard(true);
			}
		}else {
			System.out.println("You already have an item card!!!");
		}
		
		
		
	}
}
