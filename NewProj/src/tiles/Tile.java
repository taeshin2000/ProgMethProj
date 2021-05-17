package tiles;

import javafx.scene.layout.StackPane;

public class Tile extends StackPane  {

	private int position;
	
	public Tile(int pos) {
		this.position = pos;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	
}
