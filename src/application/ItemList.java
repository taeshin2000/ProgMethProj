package application;

import java.util.ArrayList;
import java.util.Random;

import itemcard.GetMoneyCard;
import itemcard.ItemCard;
import itemcard.LoseMoneyCard;
import itemcard.ProtectionCard;

public class ItemList {
	
	private static ArrayList<ItemCard> items;
	private static Random ran = new Random();
	
	public ItemList() {
		this.items = new ArrayList<ItemCard>();
		
		items.add(new GetMoneyCard("GetMoneyCard"));
		items.add(new LoseMoneyCard("LoseMoneyCard"));
		items.add(new ProtectionCard("ProtectionCard"));
		
		
	}

	public static ItemCard randomItem() {
		int random = ran.nextInt(3);
		return items.get(random);
	}
}
