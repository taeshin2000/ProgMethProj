package gui.imagebtn;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CloseButton extends ImageButton {
	private final Image closeBtnIMG = new Image(ClassLoader.getSystemResourceAsStream("button/Btn_Close.png"));
	
	public CloseButton() {
		this.setImage(closeBtnIMG);
		this.setStyle("-fx-cursor: hand;");
	}
}
