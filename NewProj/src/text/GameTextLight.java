package text;

import javafx.scene.paint.Color;

public class GameTextLight extends GameText_BASE {

	public GameTextLight(String yourText) {
		super(yourText, 16, 300,Color.BLACK);
	}
	public GameTextLight(String yourText, int fontSize) {
		super(yourText, fontSize, 300,Color.BLACK);
	}

}
