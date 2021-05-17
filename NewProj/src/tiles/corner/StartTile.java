package tiles.corner;

import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import text.GameTextBold;
import tiles.Tile;
import tiles.TileUI;

public class StartTile extends Tile{

	public StartTile() {
		// StartTile always has a position of 0
		super(0);
//		Image player2 = new Image(ClassLoader.getSystemResourceAsStream("tiles/Tile_Start.png"));
//		this.getChildren().add(new ImageView(player2));
		
		TileUI startTile = new TileUI();
		GameTextBold startText = new GameTextBold("START", 25);
		this.getChildren().addAll(startTile,startText);
		StackPane.setAlignment(startText, Pos.CENTER);
		
	}
	

}
