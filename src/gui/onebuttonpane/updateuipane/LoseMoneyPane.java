package gui.onebuttonpane.updateuipane;

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
import tile.IslandLocationTile;
import tile.LocationTile;

public class LoseMoneyPane extends Base_UpdateUIButtonPane {
	

	public LoseMoneyPane() {
		super("You lose : ", Color.LIGHTBLUE);

		super.getOKButton().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Main.loseMoneyButton.setVisible(false);
				LocationTile tile = (LocationTile) GameController.board.getTile(GameController.turn.getCurrentPlayer().getPosition());
				if (tile instanceof IslandLocationTile) {
					updateUI();
				}else {
					Main.player1Pane.updatePlayerPane(1);
					Main.player2Pane.updatePlayerPane(2);
				}
			}
		});
		

	}

	public void updateLoseMoneyBtnScreen() {
		// TODO Auto-generated method stub
		LocationTile tile = (LocationTile) GameController.board.getTile(GameController.turn.getCurrentPlayer().getPosition());
		Platform.runLater(()->{
			this.setDisplayText("You lose : " + tile.getFallPrice() );
		});
		
		
	}

}
