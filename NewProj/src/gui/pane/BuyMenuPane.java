package gui.pane;

import gui.BuyButton;
import gui.imagebtn.CloseButton;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import text.GameText;
import text.GameTextBold;

public class BuyMenuPane extends MenuPane{
	
	GameTextBold locationText;
	GameText fallPriceText;
	GameText buyPriceText;
	GameText playerMoney;
	BuyButton buyButton;
	
	public BuyMenuPane() {
		 
		baseMenu = new StackPane();
		
		VBox optionMenu = new VBox(30);
		optionMenu.setStyle("-fx-background-color: rgba(232,234,234,0.81)"
				+ "; -fx-background-radius: 20;");
		optionMenu.setMaxSize(600, 450);
		optionMenu.setAlignment(Pos.CENTER);
		
		locationText = new GameTextBold("",30);
		fallPriceText = new GameText("",23);
		buyPriceText = new GameText("",23);
		playerMoney = new GameText("",23);
		buyButton = new BuyButton();
		
		// TODO Set things to be written here!
		setLocationText("คณะราษฏร์");
		setFallPriceText(0);
		setBuyPriceText(0);
		setPlayerMoneyText(0);
		buyButton.setPrice(20000);
		//
		
		
		optionMenu.getChildren().addAll(locationText,fallPriceText,buyPriceText,playerMoney);
		Group btn = new Group(buyButton);
		optionMenu.getChildren().add(btn);
		
		baseMenu.getChildren().add(optionMenu);
		
		closeBtn = new CloseButton();		
		closeBtn.setTranslateY(-190);
		closeBtn.setTranslateX(270);
		closeBtn.setOnMouseClicked(event->this.setVisible(false));
		baseMenu.getChildren().add(closeBtn);
		this.getChildren().addAll(coverBG,baseMenu);
	}
	
	public void setLocationText(String location) {
		this.locationText.setText(location);
	}
	public void setFallPriceText(int fallPrice) {
		this.fallPriceText.setText("ค่าผ่านทาง : "+Integer.toString(fallPrice/1000)+"k");
	}
	public void setBuyPriceText(int buyPrice) {
		this.buyPriceText.setText("ค่าซื้อต่อ : "+Integer.toString(buyPrice/1000)+"k");
	}
	public void setPlayerMoneyText(int playerMoney) {
		this.playerMoney.setText("ยอดเงินปัจจุบัน : "+ Integer.toString(playerMoney/1000)+"k");
	}
	
	public void setBuyStatus(String location, int fallPrice, int buyPrice, int playerMoney) {
		setLocationText(location);
		setFallPriceText(fallPrice);
		setBuyPriceText(buyPrice);
		setPlayerMoneyText(playerMoney);
		buyButton.setPrice(fallPrice+buyPrice);
	}
}
