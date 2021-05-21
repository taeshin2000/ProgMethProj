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

public class UpgradeBtn extends Base_TwoButtonPane {
	
	public UpgradeBtn() {
		super();
		super.setDisplayText("Do you want to upgrade this location?");
				
		super.getInteractButton().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (GameController.turn.getCurrentPlayer().upgradeLocation(((NormalLocationTile) (GameController.board.getTile(GameController.turn.getCurrentPlayer().getPosition()))))) {
					GameController.board.increaseLocationPrice(GameController.turn.getCurrentPlayer().getPosition());
					Main.player1Pane.updatePlayerPane(1);
					Main.player2Pane.updatePlayerPane(2);
					Main.upgradeButton.setVisible(false);
					GameController.increaseTurnCount();
					Main.dicePane.updateDicePaneScreen();
					Main.mainPane.getTileBtnList().get(GameController.turn.getCurrentPlayer().getPosition()).setToolTip();
					if (!Main.skipTurn) {
						GameController.turn.changeCurrentPlayer(GameController.player1, GameController.player2);
						Main.player1Pane.updatePlayerPaneScreen();
						Main.player2Pane.updatePlayerPaneScreen();
						
					}else {
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
				Main.upgradeButton.setVisible(false);
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
				
			}
		});
		
		
	}
	
	public void updateUpgradeButtonScreen(){
		NormalLocationTile tile = (NormalLocationTile) (GameController.board.getTile(GameController.turn.getCurrentPlayer().getPosition()));
		int upgradePrice = tile.getUpgradePrice();
		Platform.runLater(()->{
			super.setInteractButtonText(Integer.toString(upgradePrice));
		});
		
	}
}
