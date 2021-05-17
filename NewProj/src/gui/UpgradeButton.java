package gui;

import gui.imagebtn.ImageButton;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import text.GameTextBold;

public class UpgradeButton extends StackPane{
	GameTextBold priceText;
	
	public UpgradeButton() {
		ImageButton img = new ImageButton(new Image(ClassLoader.getSystemResourceAsStream("button/Btn_Upgrade.png")));
		priceText = new GameTextBold("",25,Color.web("4B3B3B"));
		
		this.getChildren().addAll(img,priceText);
		StackPane.setAlignment(priceText, Pos.CENTER_RIGHT);
		StackPane.setMargin(priceText, new Insets(0,20,0,0));
	}
	
	public UpgradeButton(String text) {
		this();
		setText(text);
	}
	public UpgradeButton(int price) {
		this();
		setText(Integer.toString(price/1000)+"k");
	}

	public void setText(String text) {
		this.priceText.setText(text);
	}
	public void setPrice(int price) {
		this.priceText.setText(Integer.toString(price/1000)+"k");
	}
}
