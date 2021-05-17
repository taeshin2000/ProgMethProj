package text;

import javafx.scene.paint.Color;

public class GameText extends GameText_BASE {

	
	public GameText(String yourText) {
		super(yourText, 16, 400,Color.BLACK);
	}
	public GameText(String yourText, int fontSize) {
		super(yourText, fontSize, 400,Color.BLACK);
	}
	public GameText(String yourText, int fontSize,Color color) {
		super(yourText, fontSize, 400,color);
	}

}
