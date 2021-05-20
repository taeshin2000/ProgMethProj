package gui;

import application.GameController;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;
import logic.Player;
import main.Main;

public class PlayerPane extends Pane{
	private Text playerName;
	private Text playerMoney;
	private FadeTransition fade1 = new FadeTransition();
	private FadeTransition fade2 = new FadeTransition();
	private Text playerItem;
	
	
	public PlayerPane(int player) {
		// TODO Auto-generated constructor stub
		this.setPrefSize(258, 153);
		this.playerMoney = new Text();
		this.playerMoney.setFill(Color.WHITE);
		this.playerMoney.setFont(new Font(20));
		this.playerMoney.setLayoutX(105);
		this.playerMoney.setLayoutY(120);
		
		this.playerName = new Text();
		this.playerName.setFill(Color.WHITE);
		this.playerName.setLayoutX(20);
		this.playerName.setLayoutY(35);
		this.playerName.setFont(new Font(20));
		
		this.playerItem = new Text("item : ");
		this.playerItem.setFill(Color.WHITE);
		this.playerItem.setLayoutX(100);
		this.playerItem.setLayoutY(35);
		this.playerItem.setFont(new Font(20));
		
		if (player == 1) {
			this.playerName.textProperty().setValue(GameController.player1.getName());
			this.playerMoney.textProperty().setValue(Integer.toString(GameController.player1.getMoney()));
			this.setBackground(new Background(new BackgroundImage(
	                new Image("/Player1_BG.png", 258, 153, false, true), BackgroundRepeat.NO_REPEAT,
	                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		}else {
			this.playerName.textProperty().setValue(GameController.player2.getName());
			this.playerMoney.textProperty().setValue(Integer.toString(GameController.player2.getMoney()));
			this.setBackground(new Background(new BackgroundImage(
	                new Image("/Player2_BG.png", 258, 153, false, true), BackgroundRepeat.NO_REPEAT,
	                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		}
		
		this.getChildren().addAll(playerName,playerMoney,playerItem);
		
	}
	
	public void updatePlayerPane(int player) {
		Platform.runLater(()->{
			if (player == 1) {
				this.playerName.textProperty().setValue(GameController.player1.getName()); 
				this.playerMoney.textProperty().setValue(Integer.toString(GameController.player1.getMoney()));
			} else {
				this.playerName.textProperty().setValue(GameController.player2.getName());
				this.playerMoney.textProperty().setValue(Integer.toString(GameController.player2.getMoney()));
			}
			if(GameController.player1.getHaveProtectionCard()) {
				Main.player1Pane.playerItem.textProperty().setValue("item : Protection");
			}
			if(GameController.player2.getHaveProtectionCard()) {
				Main.player2Pane.playerItem.textProperty().setValue("item : Protection");
			}
		});
		
	}
	
	public void updatePlayerPaneScreen() {
		this.fade2.setNode(Main.player2Pane);
        this.fade1.setNode(Main.player1Pane);
        if (GameController.turn.getCurrentPlayer().getPlayerNumber() == 1) {
            
            Main.player2Pane.fade2.stop();
            Main.player2Pane.fade2.setFromValue(1);
            Main.player2Pane.fade2.setToValue(1);
            Main.player2Pane.fade2.setCycleCount(1);
            Main.player2Pane.fade2.setDuration(Duration.millis(1));
            Main.player2Pane.fade2.setAutoReverse(true);
            Main.player2Pane.fade2.play();
            
            Main.player1Pane.fade1.stop();
            Main.player1Pane.fade1.setFromValue(1);
            Main.player1Pane.fade1.setToValue(0.2);
            Main.player1Pane.fade1.setCycleCount(Animation.INDEFINITE);
            Main.player1Pane.fade1.setDuration(Duration.millis(500));
            Main.player1Pane.fade1.setAutoReverse(true);
            Main.player1Pane.fade1.play();
        }else {
            
            Main.player1Pane.fade1.stop();
            Main.player1Pane.fade1.setFromValue(1);
            Main.player1Pane.fade1.setToValue(1);
            Main.player1Pane.fade1.setCycleCount(1);
            Main.player1Pane.fade1.setDuration(Duration.millis(1));
            Main.player1Pane.fade1.setAutoReverse(true);
            Main.player1Pane.fade1.play();
            
            Main.player2Pane.fade2.stop();
            Main.player2Pane.fade2.setFromValue(1);
            Main.player2Pane.fade2.setToValue(0.2);
            Main.player2Pane.fade2.setCycleCount(Animation.INDEFINITE);
            Main.player2Pane.fade2.setDuration(Duration.millis(500));
            Main.player2Pane.fade2.setAutoReverse(true);
            Main.player2Pane.fade2.play();
        }
	}
}
