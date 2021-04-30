package tile;

public class NormalLocationTile extends LocationTile  {
	private int upgradePrice;
	private boolean upgraded = false;
	private int transferPrice;
	
	public NormalLocationTile(String name,int buyprice) {
		super(name,buyprice);
		this.transferPrice =(int)(buyprice*1.5);
		this.upgradePrice = (int)(buyprice*0.5);

		
	}

	public boolean upgradeable() {
		return this.upgraded;
	}
	
	public void upgrade() {
		this.upgraded = true;
	}
	
	public int getUpgradePrice() {
		return upgradePrice;
	}

	public void increasePrice() {
		int buyprice = this.getBuyPrice();
		this.upgradePrice += (int)(0.5*buyprice);
		this.transferPrice += (int)(0.5*buyprice);
		this.setFallPrice(this.getFallPrice() + (int)(0.5*buyprice));
		upgrade();
	}
	
	

}
