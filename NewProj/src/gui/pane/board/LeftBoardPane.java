package gui.pane.board;

import javafx.scene.layout.VBox;
import tiles.IslandLocationTile;
import tiles.ItemTile;
import tiles.LocationTile;

public class LeftBoardPane extends VBox {

	private LocationTile tile7;
	private LocationTile tile8;
	private ItemTile tile9;
	private LocationTile tile10;
	private IslandLocationTile tile11;
	
	
	public LeftBoardPane() {
		this.setLayoutX(70);
		this.setLayoutY(150);
		
		tile7 = new LocationTile(7, "µÖ¡ÀÒ¤âÂ¸Ò", 22);
		tile8 = new LocationTile(8, "ÈÙ¹Âì¤ÍÁ",23);
		tile9 = new ItemTile(9);
		tile10 = new LocationTile(10, "µÖ¡ÀÒ¤ä¿¿éÒ",25);
		tile11 = new IslandLocationTile(11,"¤³ÐºÑ­ªÕ",8);
		
		this.getChildren().addAll(tile11,tile10,tile9,tile8,tile7);
	}
}
