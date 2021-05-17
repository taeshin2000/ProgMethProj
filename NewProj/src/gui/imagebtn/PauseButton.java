package gui.imagebtn;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PauseButton extends ImageButton {
	
	private final Image closeBtnIMG = new Image(ClassLoader.getSystemResourceAsStream("button/Btn_Pause.png"));
	
	public PauseButton() {
		this.setImage(closeBtnIMG);
		this.setStyle("-fx-cursor: hand;");
	}	
	
}
