package tile;

public class LocationTile extends Tile  {
	private int buyPrice;
	protected int owner = 0;
	private int fallPrice;
	private int multiplier;
	
	public LocationTile(String name,int buyprice,int multiplier,int position) {
		super(name,position);
		this.setBuyPrice(buyprice);
		this.fallPrice = (int)(0.75*buyprice);
		
		//TODO : ใช้กับอะไร?
		this.multiplier = multiplier;
	}
	
	public int getBuyPrice() {
		return this.buyPrice;
	}
	
	public void setOwner(int playerNumber) {
		this.owner = playerNumber;
	}
	
	public int getOwner() {
		return this.owner;
	}

	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}
	
	public void setFallPrice(int newfallprice) {
		this.fallPrice = newfallprice;
	}
	
	public int getFallPrice() {
		return fallPrice;
	}

	public int getTransferPrice() {
		return this.getTransferPrice();
	}
}
