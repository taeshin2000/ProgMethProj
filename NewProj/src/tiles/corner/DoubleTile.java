package tiles.corner;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import tiles.Tile;

public class DoubleTile extends Tile{

	public DoubleTile() {
		super(12);
		Image IMG = new Image(ClassLoader.getSystemResourceAsStream("tiles/Tile_Double.png"));
		this.getChildren().add(new ImageView(IMG));
	}

}
