package gui;

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

public class LoseMoneybtn extends VBox {
	private Text priceLosetext;
	private Button okButton;

	public LoseMoneybtn() {
		// TODO Auto-generated constructor stub
		this.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
		this.setAlignment(Pos.CENTER);
		this.setSpacing(50);
		this.setPrefSize(400, 300);

		this.priceLosetext = new Text();
		this.priceLosetext.setFont(new Font(20));
		this.priceLosetext.setText("You lose : ");
		
		this.okButton = new Button("OK");
		this.okButton.setPrefSize(100, 50);
		
		okButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Main.loseMoneyButton.setVisible(false);
				LocationTile tile = (LocationTile) GameController.board.getTile(GameController.turn.getCurrentPlayer().getPosition());
				if (tile instanceof IslandLocationTile) {
					Main.dicePane.getRollButton().setDisable(false);
					Main.player1Pane.updatePlayerPane(1);
					Main.player2Pane.updatePlayerPane(2);
					GameController.increaseTurnCount();
					Main.dicePane.updateDicePaneScreen();
					if (!Main.skipTurn) {
						GameController.turn.changeCurrentPlayer(GameController.player1, GameController.player2);
						Main.player1Pane.updatePlayerPaneScreen();
						Main.player2Pane.updatePlayerPaneScreen();
						
					}else {
						Main.skipTurn = false;
					}
				}else {
					Main.player1Pane.updatePlayerPane(1);
					Main.player2Pane.updatePlayerPane(2);
					
				}
			}
		});
		
		this.getChildren().addAll(priceLosetext,okButton);

	}

	public void updateLoseMoneyBtnScreen() {
		// TODO Auto-generated method stub
		LocationTile tile = (LocationTile) GameController.board.getTile(GameController.turn.getCurrentPlayer().getPosition());
		Platform.runLater(()->{
			this.priceLosetext.textProperty().setValue("You lose : " + tile.getFallPrice() );
		});
		
		
	}

}
