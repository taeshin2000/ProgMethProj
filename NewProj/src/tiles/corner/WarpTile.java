package tiles.corner;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import tiles.Tile;

public class WarpTile extends Tile{

	public WarpTile() {
		super(18);
		Image IMG = new Image(ClassLoader.getSystemResourceAsStream("tiles/Tile_Warp.png"));
		this.getChildren().add(new ImageView(IMG));
	}

}