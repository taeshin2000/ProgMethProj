package gui.onebuttonpane.updateuipane;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import main.Main;


public class DrunkPane extends Base_UpdateUIButtonPane {
	

	public DrunkPane() {
		super("You are drunk and lose 50% of your money!!!", Color.MEDIUMPURPLE);

		super.getOKButton().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Main.drunkPane.setVisible(false);
				updateUI();
			}

		});

		
	}
}
