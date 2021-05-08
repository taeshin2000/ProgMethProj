package tile;

import java.util.ArrayList;

import application.InitialBoard;
import application.ItemList;
import itemcard.ItemCard;
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
		
		
		
	}
}
