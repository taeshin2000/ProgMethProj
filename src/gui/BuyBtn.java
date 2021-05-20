package gui;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import tile.LocationTile;
import application.GameController;
import logic.Turn;
import main.Main;

public class BuyBtn extends VBox {
	private Text buyText;
	private Button buyButton;
	private Button noButton;

	public BuyBtn() {
		// TODO Auto-generated constructor stub
		this.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
		this.setAlignment(Pos.CENTER);
		this.setSpacing(20);
		this.setPrefSize(400, 200);
		this.buyButton = new Button("Yes");
		buyButton.setPrefSize(100, 50);
		buyButton.setFont(new Font(20));

		this.noButton = new Button("No");
		noButton.setPrefSize(100, 50);
		noButton.setFont(new Font(20));
		buyText = new Text();
		buyText.setFont(new Font(20));
		buyText.setText("Do you want to buy this location?");
		this.getChildren().addAll(buyText, buyButton, noButton);

		buyButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (GameController.turn.getCurrentPlayer().buyLocation(((LocationTile) (GameController.board
						.getTile(GameController.turn.getCurrentPlayer().getPosition()))))) {

					GameController.board.setLocationTileOwner(GameController.turn.getCurrentPlayer().getPosition(),
							GameController.turn.getCurrentPlayer().getPlayerNumber());
					Main.player1Pane.updatePlayerPane(1);
					Main.player2Pane.updatePlayerPane(2);
					String cssDefault;
					if (GameController.turn.getCurrentPlayer().getPlayerNumber() == 1) {
						cssDefault = "-fx-border-color: red;\n" + "-fx-border-insets: 0;\n" + "-fx-border-width: 4;\n"
								+ "-fx-border-style: solid;\n";

					} else {
						cssDefault = "-fx-border-color: green;\n" + "-fx-border-insets: 0;\n" + "-fx-border-width: 4;\n"
								+ "-fx-border-style: solid;\n";

					}
					Main.mainPane.getTileBtnList().get(GameController.turn.getCurrentPlayer().getPosition())
							.setStyle(cssDefault);
					visible(false);
					GameController.increaseTurnCount();
					Main.dicePane.updateDicePaneScreen();
					if (!Main.skipTurn) {
						GameController.turn.changeCurrentPlayer(GameController.player1, GameController.player2);
						Main.player1Pane.updatePlayerPaneScreen();
						Main.player2Pane.updatePlayerPaneScreen();

					} else {
						Main.skipTurn = false;
					}
					Main.dicePane.getRollButton().setDisable(false);
				} else {

				}

			}

		});

		noButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				visible(false);
				GameController.increaseTurnCount();
				Main.dicePane.updateDicePaneScreen();
				if (!Main.skipTurn) {
					GameController.turn.changeCurrentPlayer(GameController.player1, GameController.player2);
					Main.player1Pane.updatePlayerPaneScreen();
					Main.player2Pane.updatePlayerPaneScreen();

				} else {
					Main.skipTurn = false;
				}
				Main.dicePane.getRollButton().setDisable(false);
			}
		});

	}

	public void visible(boolean b) {
		// TODO Auto-generated method stub
		this.setVisible(b);

	}

	public void updateBuyButtonScreen() {
		// TODO Auto-generated method stub
		LocationTile tile = (LocationTile) (GameController.board
				.getTile(GameController.turn.getCurrentPlayer().getPosition()));
		int buyPrice = tile.getBuyPrice();
		Platform.runLater(()->{
			buyButton.setText(Integer.toString(buyPrice));
		});
		

	}
}
