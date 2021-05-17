package tiles;

import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import text.GameTextBold;

public class ItemTile extends Tile{

	public ItemTile(int pos) {
		super(pos);
		// TODO Auto-generated constructor stub
		TileUI itemTile = new TileUI();
		itemTile.setColorCode("Blue");
		itemTile.setStyleNoBorder();
		
		GameTextBold itemText = new GameTextBold("Item", 25,Color.WHITE);
		this.getChildren().addAll(itemTile,itemText);
		StackPane.setAlignment(itemText, Pos.CENTER);
	}

}
