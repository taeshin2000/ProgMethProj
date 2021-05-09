package itemcard;

import logic.Player;

public abstract class UseLaterCard extends ItemCard {
	private String name;
	
	public UseLaterCard(String name) {
		super(name);
	}
	
	public abstract void Use(Player player);

}
