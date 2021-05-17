package gui.pane;

import gui.UpgradeButton;
import gui.imagebtn.CloseButton;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import text.GameText;
import text.GameTextBold;

public class UpgradeMenuPane extends MenuPane{
	
	GameTextBold locationText;
	GameText upgradePriceText;
	GameText playerMoney;
	UpgradeButton upgradeButton;
	
	public UpgradeMenuPane() {
		 
		baseMenu = new StackPane();
		
		VBox optionMenu = new VBox(30);
		optionMenu.setStyle("-fx-background-color: rgba(232,234,234,0.81)"
				+ "; -fx-background-radius: 20;");
		optionMenu.setMaxSize(600, 450);
		optionMenu.setAlignment(Pos.CENTER);
		
		locationText = new GameTextBold("",30);
		upgradePriceText = new GameText("",23);
		playerMoney = new GameText("",23);
		upgradeButton = new UpgradeButton();
		
		// TODO Set things to be written here!
		setLocationText("คณะราษฏร์");
		setUpgradePriceText(0);
		setPlayerMoneyText(0);
		upgradeButton.setPrice(20000);
		//
		
		
		optionMenu.getChildren().addAll(locationText,upgradePriceText,playerMoney);
		Group btn = new Group(upgradeButton);
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
	public void setUpgradePriceText(int buyPrice) {
		this.upgradePriceText.setText("ค่าซื้อต่อ : "+Integer.toString(buyPrice/1000)+"k");
	}
	public void setPlayerMoneyText(int playerMoney) {
		this.playerMoney.setText("ยอดเงินปัจจุบัน : "+ Integer.toString(playerMoney/1000)+"k");
	}
	
	public void setUpgradeStatus(String location, int upgradePrice, int playerMoney) {
		setLocationText(location);
		setUpgradePriceText(upgradePrice);
		setPlayerMoneyText(playerMoney);
		upgradeButton.setPrice(upgradePrice);
	}
}
