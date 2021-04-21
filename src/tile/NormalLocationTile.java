package tile;

public class NormalLocationTile extends LocationTile implements Interactable {
	private int upgradePrice;
	private int houseLevel = 0;
	private int transferPrice;
	private boolean upgraded = false;
	
	public NormalLocationTile(String name,int buyprice,int fallprice,int upgradeprice,int transferprice ) {
		super(name,buyprice,fallprice);
		this.upgradePrice = upgradeprice;
		this.transferPrice = transferprice;
		
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		
	}
	
	

}
