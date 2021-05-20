package gui;

import java.io.File;

import application.GameController;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import logic.CheckEndGame;
import main.Main;
import gui.MainPane;

public class DicePane extends VBox {
	private Text turnCount;
	private Button rollButton;
	private Pane diceImage = new Pane();

	public DicePane() {
		// TODO Auto-generated constructor stub
		this.rollButton = new Button();
		rollButton.setFont(new Font(30));
		rollButton.setText("Roll");
		updateDiceImage(1);

		this.rollButton.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 100px; " + "-fx-min-height: 100px; "
				+ "-fx-max-width: 100px; " + "-fx-max-height: 100px;");
		rollButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Thread t1 = new Thread(()->{
					
					int step = GameController.turn.rollDice();
					updateDiceImage(step);
					if ((GameController.turn.getCurrentPlayer().getPosition() + step) % 24 < GameController.turn.getCurrentPlayer().getPosition()) {
						GameController.turn.getCurrentPlayer().increaseMoney(20000);
					}
					
					Main.player1Pane.updatePlayerPane(1);
					Main.player2Pane.updatePlayerPane(2);
					(GameController.turn.getCurrentPlayer()).move(step);
					Main.mainPane.updateMainPaneScreen();
					rollButton.setDisable(true);
					try {
						Thread.sleep(30);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					GameController.turn.action(GameController.board, GameController.player1, GameController.player2,
							GameController.gameOver, GameController.winner);
					CheckEndGame.checkEndGame();
				});
				t1.start();
			}

		});

		this.turnCount = new Text();
		this.turnCount.setFont(new Font(30));
		this.turnCount.setFill(Color.WHITE);
		this.turnCount.textProperty().setValue("Turn count : " + Integer.toString(GameController.turnCount));
		this.setSpacing(20);
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(turnCount, diceImage, rollButton);
	}

	public void updateDiceImage(int step) {
		// TODO Auto-generated method stub
		String url = "/dice/" + step + ".png";
		diceImage.setBackground(
				new Background(new BackgroundImage(new Image(url, 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
						BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		diceImage.setPrefHeight(100);
		diceImage.setPrefWidth(100);

	}
	
	public void updateDicePaneScreen() {
		this.turnCount.setText("Turn count : " + Integer.toString(GameController.turnCount));
	}
	
	public Button getRollButton() {
		return rollButton;
	}
	
}
