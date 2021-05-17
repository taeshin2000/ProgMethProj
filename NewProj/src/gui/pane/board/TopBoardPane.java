package gui.pane.board;

import javafx.scene.layout.HBox;
import tiles.ItemTile;
import tiles.LocationTile;
import tiles.corner.DoubleTile;
import tiles.corner.WarpTile;

public class TopBoardPane extends HBox  {
	
	DoubleTile doubleTile;
	LocationTile tile13;
	LocationTile tile14;
	ItemTile tile15;
	LocationTile tile16;
	LocationTile tile17;
	WarpTile warpTile;
	
	public TopBoardPane() {
		this.setLayoutX(70);
		this.setLayoutY(50);
		
		doubleTile = new DoubleTile();
		tile13 = new LocationTile(13, "ตึก 100ปี", 30);
		tile14 = new LocationTile(14, "ตึก 4", 35);
		tile15 = new ItemTile(15);
		tile16 = new LocationTile(16, "หอกลาง", 40);
		tile17 = new LocationTile(17, "iCanteen", 45);
		warpTile = new WarpTile();
		
		this.getChildren().addAll(doubleTile,tile13,tile14,tile15,tile16,tile17,warpTile);
	}
}
