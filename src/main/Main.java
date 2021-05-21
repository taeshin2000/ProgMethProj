package main;

import java.util.ArrayList;

import application.GameController;
import gui.DicePane;
import gui.MainPane;
import gui.PlayerPane;
import gui.onebuttonpane.exitgamepane.P1WinPane;
import gui.onebuttonpane.exitgamepane.P2WinPane;
import gui.onebuttonpane.exitgamepane.TiePane;
import gui.onebuttonpane.updateuipane.APane;
import gui.onebuttonpane.updateuipane.DrunkPane;
import gui.onebuttonpane.updateuipane.GetItemPane;
import gui.onebuttonpane.updateuipane.JailPane;
import gui.onebuttonpane.updateuipane.LoseMoneyPane;
import gui.onebuttonpane.updateuipane.StartPane;
import gui.twobuttonpane.BuyBtn;
import gui.twobuttonpane.TransferBtn;
import gui.twobuttonpane.UpgradeBtn;
import javafx.animation.Animation;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class Main extends Application {
	public static Pane gamePane;
	public static PlayerPane player1Pane;
	public static PlayerPane player2Pane;
	public static DicePane dicePane;
	public static MainPane mainPane;
	public static BuyBtn buyButton;
	public static UpgradeBtn upgradeButton;
	public static TransferBtn transferButton;
	public static GetItemPane getItemPane;
	public static LoseMoneyPane loseMoneyButton;
	public static boolean skipTurn = false;
	public static DrunkPane drunkPane;
	public static APane aPane;
	public static TiePane tiePane;
	public static P1WinPane p1WinPane;
	public static P2WinPane p2WinPane;
	public static MediaPlayer mediaPlayer;
	
	public static JailPane jailPane;
	public static StartPane startPane;

	public void start(Stage primaryStage) {

		Pane startingGame = new Pane();
		Scene scene = new Scene(startingGame, 1200, 800);
		primaryStage.setTitle("Let's get rich in chula");
		primaryStage.setScene(scene);
		primaryStage.show();
		startingGame.setBackground(new Background(
				new BackgroundImage(new Image("/MainMenuBG.png", 1200, 800, false, true), BackgroundRepeat.NO_REPEAT,
						BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));

		TextField player1Name = new TextField("Input player1 name and press enter!");
		TextField player2Name = new TextField("Input player2 name and press enter!");
		player1Name.setPrefHeight(50);
		player1Name.setPrefWidth(300);
		player1Name.setLayoutX(800);
		player1Name.setLayoutY(400);
		player2Name.setPrefHeight(50);
		player2Name.setPrefWidth(300);
		player2Name.setLayoutX(800);
		player2Name.setLayoutY(500);
		player2Name.setDisable(true);
		player1Name.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				// TODO Auto-generated method stub
				player1Name.clear();
			}
		});
		player1Name.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent keyEvent) {
				// TODO Auto-generated method stub
				if (keyEvent.getCode().equals(KeyCode.ENTER)) {
					if (player1Name.getText().equals("Input player1 name and press enter!") 
							|| player1Name.getText().isBlank()) {
						GameController.player1.setName("Player1");
					}
					else {
						GameController.player1.setName(player1Name.getText());
					}
					player1Name.setDisable(true);
					player2Name.setDisable(false);
				}
			}
		});
		player2Name.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				// TODO Auto-generated method stub
				player2Name.clear();
			}
		});
		player2Name.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent keyEvent) {
				// TODO Auto-generated method stub
				if (keyEvent.getCode().equals(KeyCode.ENTER)) {
					if (player2Name.getText().equals("Input player2 name and press enter!") 
							|| player2Name.getText().isBlank()) {
						GameController.player2.setName("Player2");
					}
					else {
						GameController.player2.setName(player2Name.getText());
					}
					GameController.initilizeGame();
					primaryStage.setScene(createGameScene());
					primaryStage.show();

				}
			}
		});
		startingGame.getChildren().addAll(player1Name, player2Name);

	}

	public static Scene createGameScene() {
		Media musicFile = new Media(ClassLoader.getSystemResource("bgm.mp3").toString());
        MediaPlayer bgm = new MediaPlayer(musicFile);
        mediaPlayer = bgm;
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setCycleCount(Animation.INDEFINITE);
        mediaPlayer.setVolume(0.1);
		gamePane = new Pane();
		gamePane.setPrefSize(1200, 800);
		gamePane.setBackground(new Background(
				new BackgroundImage(new Image("/BG.png", 1200, 800, false, true), BackgroundRepeat.NO_REPEAT,
						BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		Scene gameScene = new Scene(gamePane, 1200, 800);
		
		
		player1Pane = new PlayerPane(1);
		player1Pane.setLayoutX(900);
		player1Pane.setLayoutY(100);

		player2Pane = new PlayerPane(2);
		player2Pane.setLayoutX(900);
		player2Pane.setLayoutY(280);

		dicePane = new DicePane();
		dicePane.setLayoutX(930);
		dicePane.setLayoutY(450);

		mainPane = new MainPane();
		mainPane.setLayoutX(80);
		mainPane.setLayoutY(50);
		gamePane.getChildren().addAll(player1Pane, player2Pane, dicePane, mainPane);
		
		ArrayList<VBox> list = new ArrayList<VBox>();	
		list.add(buyButton = new BuyBtn());
		list.add(upgradeButton = new UpgradeBtn());     
		list.add(transferButton = new TransferBtn());   
		list.add(getItemPane = new GetItemPane());      
		list.add(loseMoneyButton = new LoseMoneyPane());
		list.add(drunkPane = new DrunkPane());
		list.add(aPane = new APane());
		list.add(tiePane = new TiePane());
		list.add(p1WinPane = new P1WinPane());
		list.add(p2WinPane = new P2WinPane());
		list.add(jailPane = new JailPane());
		list.add(startPane = new StartPane());

		for (VBox pane : list) {
			pane.setLayoutX(228);
			pane.setLayoutY(300);
			pane.setVisible(false);
			gamePane.getChildren().add(pane);
		}
		

		player1Pane.updatePlayerPaneScreen();
		player2Pane.updatePlayerPaneScreen();
		mainPane.updateMainPaneScreen();
		
		return gameScene;

	}

	public static void main(String[] args) {
		launch(args);
	}
}
