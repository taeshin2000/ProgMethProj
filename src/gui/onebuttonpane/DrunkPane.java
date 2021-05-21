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
import tile.IslandLocationTile;
import tile.LocationTile;

public class DrunkPane extends VBox {
	private Text drunkText;
	private Button okButton;

	public DrunkPane() {
		// TODO Auto-generated constructor stub
		this.setBackground(new Background(new BackgroundFill(Color.MEDIUMPURPLE, null, null)));
		this.setAlignment(Pos.CENTER);
		this.setSpacing(50);
		this.setPrefSize(400, 300);

		this.drunkText = new Text();
		this.drunkText.setFont(new Font(20));
		this.drunkText.setText("You are drunk and lose 50% of your money!!!");

		this.okButton = new Button("OK");
		this.okButton.setPrefSize(100, 50);

		okButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Main.drunkPane.setVisible(false);

				Main.dicePane.getRollButton().setDisable(false);
				Main.player1Pane.updatePlayerPane(1);
				Main.player2Pane.updatePlayerPane(2);
				GameController.increaseTurnCount();
				Main.dicePane.updateDicePaneScreen();
				if (!Main.skipTurn) {
					GameController.turn.changeCurrentPlayer(GameController.player1, GameController.player2);
					Main.player1Pane.updatePlayerPaneScreen();
					Main.player2Pane.updatePlayerPaneScreen();

				} else {
					Main.skipTurn = false;
				}

			}

		});

		this.getChildren().addAll(drunkText, okButton);

	}
}
