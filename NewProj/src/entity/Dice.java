package entity;
import javafx.scene.image.Image;

public class Dice {
	private int diceNumber;
	private String imgPath;
	private Image image;
	

	public Dice(int diceNumber) {
		if (diceNumber >= 1 && diceNumber <= 6) {
			this.diceNumber = diceNumber;
			this.imgPath = "dice/Dice_"+Integer.toString(diceNumber)+".png";
			this.image = new Image(ClassLoader.getSystemResourceAsStream(this.imgPath));
		}
	}

	public int getDiceNumber() {
		return diceNumber;
	}
	public void setDiceNumber(int diceNumber) {
		this.diceNumber = diceNumber;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public Image getImage() {
		return image;
	}
	
	
}
