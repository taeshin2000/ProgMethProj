package gui.imagebtn;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;

public class ImageButton extends ImageView{
	
	private AudioClip clickAudioClip = new AudioClip(ClassLoader.getSystemResource("sound/Click.mp3").toString());
	
	public ImageButton() {
		this.setStyle("-fx-cursor: hand;");
		this.setOnMouseClicked(event->clickAudioClip.play());
	}
	
	public ImageButton(Image image) {
		this();
		this.setImage(image);
	}
	
	public void playSound() {
		clickAudioClip.play();
	}
	
}
