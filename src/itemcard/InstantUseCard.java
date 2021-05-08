package itemcard;

import logic.Player;

public abstract class InstantUseCard extends ItemCard {
	
	public InstantUseCard(String name) {
		super(name);
	}
	
	public abstract void active(Player player);
}
