package gui.twobuttonpane;

import application.GameController;
import javafx.application.Platform;
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

public class TransferBtn extends Base_TwoButtonPane {
	
	public TransferBtn() {
		super();
		super.setDisplayText("Do you want to transfer this location to you?");
		
		super.getInteractButton().setOnAction(new EventHandler<ActionEvent>() {
			
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
		
		
		
	}
	public void updateTransferBtnScreen() {
		// TODO Auto-generated method stub
		NormalLocationTile tile = (NormalLocationTile) (GameController.board.getTile(GameController.turn.getCurrentPlayer().getPosition()));
		int transferPrice = tile.getTransferPrice();
		Platform.runLater(()->{
			super.setInteractButtonText(Integer.toString(transferPrice));
		});
		
		
	}
}
