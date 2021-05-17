package gui.pane;

import gui.GameButton;
import gui.MenuButton;
import gui.imagebtn.CloseButton;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class PauseMenuPane extends MenuPane{
	
	
	GameButton buttonBase1;
	GameButton buttonBase2;
	
	
	public PauseMenuPane() {
		super();
		
		baseMenu = new StackPane();
		
		VBox optionMenu = new VBox(20);
		optionMenu.setStyle("-fx-background-color: rgba(232,234,234,0.81)"
				+ "; -fx-background-radius: 20;");
		optionMenu.setMaxSize(300, 350);
		optionMenu.setAlignment(Pos.CENTER);
		

		buttonBase1 = new MenuButton();
		buttonBase2 = new MenuButton();
		
		buttonBase1.setButtonText("เปิด/ปิดเสียง");
		buttonBase2.setButtonText("หน้าหลัก");
		
		optionMenu.getChildren().addAll(buttonBase1,buttonBase2);
		baseMenu.getChildren().add(optionMenu);
		
		closeBtn = new CloseButton();		
		closeBtn.setTranslateY(-140);
		closeBtn.setTranslateX(120);
		closeBtn.setOnMouseClicked(event->this.setVisible(false));
		
		
		baseMenu.getChildren().add(closeBtn);
		
		this.getChildren().addAll(coverBG,baseMenu);
		this.setVisible(false);
	}
	
}
