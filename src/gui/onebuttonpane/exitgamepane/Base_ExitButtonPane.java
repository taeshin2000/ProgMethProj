package gui.onebuttonpane.exitgamepane;

import gui.onebuttonpane.Base_OneButtonPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;

public abstract class Base_ExitButtonPane extends Base_OneButtonPane{

	public Base_ExitButtonPane(String display, Color bgColor) {
		super(display, bgColor);
		setOKButtonText("Quit Game");
		this.getOKButton().setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
	}

}
