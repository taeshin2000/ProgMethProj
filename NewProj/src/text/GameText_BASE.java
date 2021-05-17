package text;

import java.io.InputStream;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class GameText_BASE extends Text {

	public GameText_BASE(String yourText, int fontSize,int fontWeight, Color color) {
		String placeholder = "font/Prompt"
				+ Integer.toString(fontWeight)
				+ ".ttf";
		String fontPath = ClassLoader.getSystemResource(placeholder).toString();
		
		this.setFill(color);
		this.setFont(Font.loadFont(fontPath, fontSize));
		this.setText(yourText);
	}

}
