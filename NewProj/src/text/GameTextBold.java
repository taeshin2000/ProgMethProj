package text;

import javafx.scene.paint.Color;

public class GameTextBold extends GameText_BASE{

	public GameTextBold(String yourText) {
		super(yourText, 16, 600,Color.BLACK);
	}
	
	public GameTextBold(String yourText, int fontSize) {
		super(yourText, fontSize, 600,Color.BLACK);
	}
	
	public GameTextBold(String yourText, int fontSize, Color color) {
		super(yourText, fontSize, 600,color);
	}

}
