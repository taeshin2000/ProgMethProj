package tiles;

public class IslandLocationTile extends LocationTile {

	public IslandLocationTile(int pos, String locationString, int priceInt) {
		super(pos, locationString, priceInt,"Pink");
		this.tileUI.setStyleWithBorder();
	}
	
	
	@Override
	public void updateColor() {
		tileUI.setColorCode("Pink");
		tileUI.setStyleWithBorder();
	}
	
	@Override
	public void updateColor(String color) {
		tileUI.setColorCode(color);
		tileUI.setStyleWithBorder();
	}

}
