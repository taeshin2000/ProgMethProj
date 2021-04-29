package tile;

public class LocationTile extends Tile  {
	private int buyPrice;
	private int owner = 0;
	private int fallPrice;
	
	public LocationTile(String name,int buyprice) {
		super(name);
		this.buyPrice = buyprice;
		this.fallPrice = (int)0.75*buyprice;
		
		
	}
	
}
