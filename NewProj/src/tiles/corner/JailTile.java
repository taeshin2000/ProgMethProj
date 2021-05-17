package tiles.corner;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import tiles.Tile;

public class JailTile extends Tile{

	public JailTile() {
		super(6);
		Image jailIMG = new Image(ClassLoader.getSystemResourceAsStream("tiles/Tile_Jail.png"));
		this.getChildren().add(new ImageView(jailIMG));
	}

}
