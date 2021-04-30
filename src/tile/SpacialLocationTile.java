package tile;

public class SpacialLocationTile extends LocationTile implements Interactable {
	
	public SpacialLocationTile(String name,int buyprice) {
		super(name,buyprice);
		
		
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		
	}
	
	public int getOwner() {
		return this.owner;
	}
}
