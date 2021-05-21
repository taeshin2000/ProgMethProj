package gui.onebuttonpane.updateuipane;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import main.Main;

public class StartPane extends Base_UpdateUIButtonPane {

	public StartPane() {
		super("You got 20,000 for passing the start! ", Color.WHITESMOKE);
		
		super.getOKButton().setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Main.startPane.setVisible(false);
				updateUI();			
			}
		});
	}

}
