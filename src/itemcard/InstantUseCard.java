package itemcard;

public abstract class InstantUseCard extends ItemCard {
	
	public InstantUseCard(String name) {
		super(name);
	}
	
	public abstract void active();
}
