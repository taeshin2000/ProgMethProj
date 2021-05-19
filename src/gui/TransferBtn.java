package gui;

import application.GameController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import main.Main;
import tile.LocationTile;
import tile.NormalLocationTile;

public class TransferBtn extends VBox {
	private Text transferText;
	private Button transferButton;
	private Button noButton;
	public TransferBtn() {
		// TODO Auto-generated constructor stub
		this.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
		this.setAlignment(Pos.CENTER);
		this.setSpacing(20);
		this.setPrefSize(400, 300);
		
		this.transferButton = new Button("Yes");
		transferButton.setPrefSize(100, 50);
		transferButton.setFont(new Font(20));
		
		this.noButton = new Button("No");
		noButton.setPrefSize(100, 50);
		noButton.setFont(new Font(20));
		
		transferText = new Text();
		transferText.setFont(new Font(20));
		transferText.setText("Do you want to transfer this location to you?");
		
		transferButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (GameController.turn.getCurrentPlayer().transferLocation(((NormalLocationTile) (GameController.board.getTile(GameController.turn.getCurrentPlayer().getPosition()))))) {
					String cssDefault;
					if (GameController.turn.getCurrentPlayer().getPlayerNumber() == 1) {
						cssDefault = "-fx-border-color: red;\n"
								+ "-fx-border-insets: 0;\n"
								+ "-fx-border-width: 4;\n"
								+ "-fx-border-style: solid;\n";
						GameController.player2.removeLocation((NormalLocationTile) (GameController.board.getTile(GameController.turn.getCurrentPlayer().getPosition())));
					}else {
						cssDefault = "-fx-border-color: green;\n"
								+ "-fx-border-insets: 0;\n"
								+ "-fx-border-width: 4;\n"
								+ "-fx-border-style: solid;\n";
						
						GameController.player1.removeLocation((NormalLocationTile) (GameController.board.getTile(GameController.turn.getCurrentPlayer().getPosition())));
					}
					GameController.turn.increaseOtherPlayerMoney(
							((LocationTile) (GameController.board.getTile(GameController.turn.getCurrentPlayer().getPosition()))).getTransferPrice(), GameController.player1,
							GameController.player2);
					GameController.board.setLocationTileOwner(GameController.turn.getCurrentPlayer().getPosition(), GameController.turn.getCurrentPlayer().getPlayerNumber());
					Main.player1Pane.updatePlayerPane(1);
					Main.player2Pane.updatePlayerPane(2);
					Main.mainPane.getTileBtnList().get(GameController.turn.getCurrentPlayer().getPosition()).setStyle(cssDefault);
					GameController.increaseTurnCount();
					Main.dicePane.updateDicePaneScreen();
					if (!Main.skipTurn) {
						GameController.turn.changeCurrentPlayer(GameController.player1, GameController.player2);
						Main.player1Pane.updatePlayerPaneScreen();
						Main.player2Pane.updatePlayerPaneScreen();
						
					}else {
						Main.skipTurn = false;
					}
					Main.dicePane.getRollButton().setDisable(false);
					Main.transferButton.setVisible(false);
					
				} else {
					
				}
			}
		});
		
		noButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Main.transferButton.setVisible(false);
				Main.dicePane.updateDicePaneScreen();
				if (!Main.skipTurn) {
					GameController.turn.changeCurrentPlayer(GameController.player1, GameController.player2);
					Main.player1Pane.updatePlayerPaneScreen();
					Main.player2Pane.updatePlayerPaneScreen();
					
				}else {
					Main.skipTurn = false;
				}
				Main.dicePane.getRollButton().setDisable(false);
			}
		});
		
		this.getChildren().addAll(transferText,transferButton,noButton);
		
		
	}
	public void updateTransferBtnScreen() {
		// TODO Auto-generated method stub
		NormalLocationTile tile = (NormalLocationTile) (GameController.board.getTile(GameController.turn.getCurrentPlayer().getPosition()));
		int transferPrice = tile.getTransferPrice();
		transferButton.setText(Integer.toString(transferPrice));
		
	}
}
