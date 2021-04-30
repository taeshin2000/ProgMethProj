package tile;

public class NormalLocationTile extends LocationTile  {
	private int upgradePrice;
	private boolean upgrade = true;
	private int transferPrice;
	
	public NormalLocationTile(String name,int buyprice) {
		super(name,buyprice);
		this.transferPrice =(int)(buyprice*1.5);
		this.upgradePrice = (int)(buyprice*0.5);

		
	}

	public boolean upgradeable() {
		return this.upgrade;
	}
	
	public void upgrade() {
		this.upgrade = false;
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

	public int getTransferPrice() {
		return this.transferPrice;
	}
	
	

}
