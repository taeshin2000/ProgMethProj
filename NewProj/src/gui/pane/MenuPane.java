package gui.pane;

import gui.imagebtn.CloseButton;
import javafx.scene.layout.StackPane;

public class MenuPane extends StackPane{
	StackPane coverBG;
	CloseButton closeBtn;
	StackPane baseMenu;
	
	public MenuPane() {
		coverBG = new StackPane();
		coverBG.setStyle("-fx-background-color: rgba(11,12,12,1)");
		coverBG.setOpacity(0.7);
	}
	
}
