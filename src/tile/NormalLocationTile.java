package tile;

public class NormalLocationTile extends LocationTile implements Interactable {
	private int upgradePrice;
	private int houseLevel = 0;
	private boolean upgraded = false;
	private int transferPrice;
	
	public NormalLocationTile(String name,int buyprice) {
		super(name,buyprice);
		this.transferPrice =(int)(buyprice*1.5);
		this.upgradePrice = (int)(buyprice*0.5);

		
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		
	}
	
	

}
