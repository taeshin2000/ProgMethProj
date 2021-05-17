package gui;

import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import text.GameTextBold;

public class GameButton extends StackPane{
	
	private AudioClip clickAudioClip = new AudioClip(ClassLoader.getSystemResource("sound/Click.mp3").toString());
	
	public GameButton(String colorCode, int width ,int height) {
		this.setOnMouseClicked(event->clickAudioClip.play());
		this.setStyle("-fx-background-color: "
				+ colorCode
				+ "; -fx-background-radius: 28"
				+ "; -fx-effect: dropshadow(gaussian, rgba(0,0,0,0.2),10, 0, 0, 4)");
		this.setPrefSize(width, height);
		this.setMaxSize(width, height);
	}
	

	
	public void setButtonText(String text) {
		GameTextBold btnText = new GameTextBold(text, 24);
		this.getChildren().add(btnText);
	}
	public void setButtonText(String text, int fontSize) {
		GameTextBold btnText = new GameTextBold(text, fontSize);
		this.getChildren().add(btnText);
	}
	
}
