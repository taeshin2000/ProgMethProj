package tile;

public class LocationTile extends Tile  {
	private int buyPrice;
	private int owner = 0;
	private int fallPrice;
	
	public LocationTile(String name,int buyprice,int fallprice) {
		super(name);
		this.buyPrice = buyprice;
		this.fallPrice = fallprice;
		
		
	}
	
}
