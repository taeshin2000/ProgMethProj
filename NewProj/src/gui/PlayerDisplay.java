package gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import text.GameText;
import text.GameTextBold;

public class PlayerDisplay extends StackPane{

	public Image img;
	private GameTextBold playerName;
	private GameText playerPrice;
	private GameText currentPlayer;
	
	public PlayerDisplay(int playerNumber) {

		img = new Image(ClassLoader.getSystemResourceAsStream("player/Player"
				+ Integer.toString(playerNumber)
				+ "_BG.png"));
		playerName = new GameTextBold("",23,Color.WHITE);
		playerPrice = new GameText("",21,Color.WHITE);
		currentPlayer = new GameText("",18,Color.WHITE);
		
		this.getChildren().addAll(new ImageView(img),playerName,playerPrice,currentPlayer);
		
		// Insets --> Top Right Bottom Left
		StackPane.setAlignment(playerName, Pos.TOP_LEFT);
		StackPane.setMargin(playerName, new Insets(8,0,0,20));
		
		StackPane.setAlignment(playerPrice, Pos.BOTTOM_RIGHT);
		StackPane.setMargin(playerPrice, new Insets(0,25,10,0));
		
		StackPane.setAlignment(currentPlayer, Pos.TOP_RIGHT);
		StackPane.setMargin(currentPlayer, new Insets(12, 20, 0, 0));
		
	}
	
	public void updateTextPlayerName(String playerName) {
		this.playerName.setText(playerName);
	}
	public void updateTextPlayerPrice(String price) {
		this.playerPrice.setText(price);
	}
	public void updatePlayerPrice(int price) {
		this.playerPrice.setText(Integer.toString(price/1000)+"k");
	}
	
	public void setCurrentPlayer() {
		this.currentPlayer.setText("(Current)");
	}
}
