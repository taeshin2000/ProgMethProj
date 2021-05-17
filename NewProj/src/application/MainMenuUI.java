package application;

import gui.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class MainMenuUI extends Pane {
	
	private VBox menuBox;
	private MenuButton startButton;
	private MenuButton exitButton;
	
	public MainMenuUI() {
		
		// Set background
		Image backgroundImage = new Image(ClassLoader.getSystemResourceAsStream("background/MainMenuBG.png"));
		this.setBackground(new Background(new BackgroundImage(backgroundImage,BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		          BackgroundSize.DEFAULT)) );
		
		menuBox = new VBox(30);
		menuBox.setLayoutX(850);menuBox.setLayoutY(310);
		startButton = new MenuButton("เริ่มเกม!");
		exitButton = new MenuButton("ออกจากเกม");
		menuBox.getChildren().addAll(startButton,exitButton);
		
		
		this.getChildren().add(menuBox);
	}
}
