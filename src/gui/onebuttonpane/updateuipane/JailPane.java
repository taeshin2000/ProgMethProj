package gui.onebuttonpane.updateuipane;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import main.Main;

public class JailPane extends Base_UpdateUIButtonPane{

	public JailPane() {
		super("You are now stuck in LarnGear \n"
				+ "Can't move for 1 turn ", Color.WHITESMOKE);
		
		super.getOKButton().setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Main.jailPane.setVisible(false);
				updateUI();			
			}
		});
	}

}
